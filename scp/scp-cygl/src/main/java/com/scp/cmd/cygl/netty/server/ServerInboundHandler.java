package com.scp.cmd.cygl.netty.server;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("serverInHandler")
@ChannelHandler.Sharable
public class ServerInboundHandler extends ChannelInboundHandlerAdapter {

	@Value("${mml.host}")
	private String mml_host;

	@Value("${mml.port}")
	private int mml_port;

	// 代理服务器和目标服务器之间的通道（从代理服务器出去所以是outbound过境）
	private volatile Channel outboundChannel;

	public void channelActive(ChannelHandlerContext ctx) throws Exception {

	}

	/**
	 * 在这里接收客户端的消息 在客户端和代理服务器建立连接时，也获得了代理服务器和目标服务器的通道outbound， 通过outbound写入消息到目标服务器
	 *
	 * @param ctx
	 * @param msg
	 * @throws Exception
	 */
	@Override
	public void channelRead(final ChannelHandlerContext ctx, Object msg) throws Exception {
		/**
		 * 客户端和代理服务器的连接通道 入境的通道
		 */
		final Channel inboundChannel = ctx.channel();
		// Start the connection attempt.
		Bootstrap b = new Bootstrap();
		b.group(inboundChannel.eventLoop()).channel(ctx.channel().getClass()).handler(new ChannelInitializer<SocketChannel>() {
			@Override
			public void initChannel(SocketChannel ch) throws Exception {
				ch.pipeline().addLast(new ServerOutboundHandler(inboundChannel));
			}
		});
		/**
		 * 连接目标服务器 ChannelFuture Netty中的IO操作是异步的， 包括bind、write、connect等操作会简单的返回一个ChannelFuture，调用者并不能立刻获得结果。
		 * 当future对象刚刚创建时，处于非完成状态。可以通过isDone()方法来判断当前操作是否完成。通过isSuccess()判断已完成的当前操作是否成功，getCause()来获取已完成的当前操作失败的原因，isCancelled()来判断已完成的当前操作是否被取消。 调用者可以通过返回的ChannelFuture来获取操作执行的状态，注册监听函数来执行完成后的操作。
		 */
		ChannelFuture f = b.connect(mml_host, mml_port);
		/**
		 * 获得代理服务器和目标服务器之间的连接通道
		 */
		outboundChannel = f.channel();
		/**
		 * ChannelFutureListener 监听ChannelFuture的状态 注册监听函数来执行完成后的操作
		 */
		f.addListener(new ChannelFutureListener() {
			@Override
			public void operationComplete(ChannelFuture future) throws Exception {
				if (future.isSuccess()) {
					// connection complete start to read first data
					inboundChannel.read();
				} else {
					// Close the connection if the connection attempt has failed.
					inboundChannel.close();
				}
			}
		});

		System.out.println("from client message:" + msg.toString());

		System.out.println("After receiving the proxy server to the client's message to the target server, said: I am a proxy server, a client asked me to say hello to you.");
		String proxyToServer = "I am a proxy server, the client asked me to say hello to you.";
		if (outboundChannel.isActive()) {
			outboundChannel.writeAndFlush(proxyToServer).addListener(new ChannelFutureListener() {
				@Override
				public void operationComplete(ChannelFuture future) throws Exception {
					if (future.isSuccess()) {
						// was able to flush out data, start to read the next chunk
						ctx.channel().read();
					} else {
						future.channel().close();
					}
				}
			});
		}
	}

}

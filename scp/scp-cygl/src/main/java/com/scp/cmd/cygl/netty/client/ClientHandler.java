package com.scp.cmd.cygl.netty.client;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.scp.cmd.cygl.util.ByteUtil;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.EventLoop;
import io.netty.channel.SimpleChannelInboundHandler;

@Component
@Qualifier("clientHandler")
@ChannelHandler.Sharable
public class ClientHandler extends SimpleChannelInboundHandler<ByteBuf> {

	@Autowired
	private NIOClient client;

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
		ByteBuf buf = (ByteBuf) msg;
		byte[] receiveMsgBytes = new byte[buf.readableBytes()];
		buf.readBytes(receiveMsgBytes);
		String content = ByteUtil.bytesToHexString(receiveMsgBytes);
		System.out.println(content);
		System.out.println(ByteUtil.hexStr2Str(content));
		String resultString = ByteUtil.str2HexStr("服务端返回的信息时:" + content);
		ByteBuf resp = Unpooled.copiedBuffer(resultString.getBytes());
		ctx.channel().writeAndFlush(resp);
	}

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		System.out.println("已经连接上远端MML服务器");
		super.channelActive(ctx);
	}

	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		System.out.println("远端MML服务器断开连接");
		final EventLoop eventLoop = ctx.channel().eventLoop();
		eventLoop.schedule(new Runnable() {
			@Override
			public void run() {
				try {
					client.run();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				;
			}
		}, 1L, TimeUnit.SECONDS);
		super.channelInactive(ctx);
	}
}
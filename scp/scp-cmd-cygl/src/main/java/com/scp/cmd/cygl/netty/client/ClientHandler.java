package com.scp.cmd.cygl.netty.client;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.EventLoop;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.scp.cmd.cygl.util.ByteUtil;

@Component
@Qualifier("clientHandler")
@ChannelHandler.Sharable
public class ClientHandler extends SimpleChannelInboundHandler<String> {
	private static final Logger log = LoggerFactory.getLogger(ClientHandler.class);

	@Autowired
	private NIOClient client;

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, String content) throws Exception {
		log.info("16进制信息是:" + content);
		String resultString = ByteUtil.str2HexStr("你的信息是:" + content);
		String realContent = ByteUtil.hexStr2Str(content);
		log.info("真实信息是:" + realContent);
		ctx.channel().writeAndFlush(resultString);
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
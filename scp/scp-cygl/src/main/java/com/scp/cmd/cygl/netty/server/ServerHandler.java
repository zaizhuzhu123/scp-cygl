package com.scp.cmd.cygl.netty.server;

import java.net.InetAddress;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

@Component
@Qualifier("serverHandler")
@ChannelHandler.Sharable
public class ServerHandler extends SimpleChannelInboundHandler<String> {
	private static final Logger log = LoggerFactory.getLogger(ServerHandler.class);

	@Override
	public void channelRead0(ChannelHandlerContext ctx, String content) throws Exception {
		log.info("你的信息是:" + content);
		ctx.channel().writeAndFlush("转发成功!");
	}

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		log.info("RamoteAddress : " + ctx.channel().remoteAddress() + " active !");
		ctx.channel().writeAndFlush("Welcome to " + InetAddress.getLocalHost().getHostName() + " service!\n");
		super.channelActive(ctx);
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
		cause.printStackTrace();
		ctx.close();
	}
}

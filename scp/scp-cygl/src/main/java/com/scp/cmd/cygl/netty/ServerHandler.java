package com.scp.cmd.cygl.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

import java.net.InetAddress;

import org.apache.commons.codec.binary.Hex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.scp.cmd.cygl.util.ByteUtil;

@Component
@Qualifier("serverHandler")
@ChannelHandler.Sharable
public class ServerHandler extends SimpleChannelInboundHandler<ByteBuf> {
	private static final Logger log = LoggerFactory.getLogger(ServerHandler.class);

	@Override
	public void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
		ByteBuf buf = (ByteBuf) msg;
		byte[] receiveMsgBytes = new byte[buf.readableBytes()];
		buf.readBytes(receiveMsgBytes);
		String content = ByteUtil.bytesToHexString(receiveMsgBytes);
		System.out.println(content);
		System.out.println(ByteUtil.hexStr2Str(content));
		String resultString = ByteUtil.str2HexStr("你的信息是:" + content);
		ByteBuf resp = Unpooled.copiedBuffer(resultString.getBytes());
		ctx.channel().writeAndFlush(resp);
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

	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		log.info("\nChannel is disconnected");
		super.channelInactive(ctx);
	}

}

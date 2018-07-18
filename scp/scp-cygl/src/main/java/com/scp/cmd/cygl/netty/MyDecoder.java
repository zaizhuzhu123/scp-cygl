package com.scp.cmd.cygl.netty;

import java.util.List;

import com.scp.cmd.cygl.util.ByteUtil;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

public class MyDecoder extends ByteToMessageDecoder {

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
		ByteBuf buf = (ByteBuf) in;
		byte[] receiveMsgBytes = new byte[buf.readableBytes()];
		buf.readBytes(receiveMsgBytes);
		String content = ByteUtil.bytesToHexString(receiveMsgBytes);
		out.add(content);
	}
}

package com.scp.cmd.cygl.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

import com.scp.cmd.cygl.util.ByteUtil;

public class MyDecoder extends ByteToMessageDecoder {

	public static final int CHAR_NL = 10;
	public static final int CHAR_ER = 13;
	public static final int CHAR_D = 68;
	public static final int CHAR_BEGIN = 0;
	public static final int MESSAGE_LENGTH = 16;

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
		ByteBuf buf = (ByteBuf) in;
		byte[] receiveMsgBytes = new byte[buf.readableBytes()];
		buf.readBytes(receiveMsgBytes);
		String content = ByteUtil.bytesToHexString(receiveMsgBytes);
		out.add(content);
	}

	public static void main(String[] args) {
		System.out.println("#" + (char) (MyDecoder.CHAR_NL) + "#");
		System.out.println("#" + (char) (MyDecoder.CHAR_ER) + "#");
		System.out.println("#" + (char) (MyDecoder.CHAR_D) + "#");
		System.out.println("#" + (char) (MyDecoder.CHAR_BEGIN) + "#");
		System.out.println("#" + (char) (MyDecoder.MESSAGE_LENGTH) + "#");
	}
}

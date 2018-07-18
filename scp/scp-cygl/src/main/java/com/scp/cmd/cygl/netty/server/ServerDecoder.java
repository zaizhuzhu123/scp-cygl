package com.scp.cmd.cygl.netty.server;

import java.util.List;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

/**
 * 防止半包解码 拆包器
 * 
 * @ClassName: ServerDecoder
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 青明锋
 * @date 2018年7月19日 上午1:51:12
 *
 */
public class ServerDecoder extends ByteToMessageDecoder {

	public static final int CHAR_NL = 10;
	public static final int CHAR_ER = 13;
	public static final int CHAR_D = 68;
	public static final int CHAR_BEGIN = 0;
	public static final int MESSAGE_LENGTH = 16;

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
		byte a = 0;
		StringBuffer sb = new StringBuffer();
		boolean isDecode = false;
		while (in.isReadable(1) && !isDecode) {
			a = in.readByte();
			if (a != CHAR_NL && a != CHAR_ER) {
				if (a == CHAR_BEGIN) {
					for (int i = 0; i < MESSAGE_LENGTH && in.isReadable(2); i++) {
						a = in.readByte();
					}
				}
				sb.append((char) a);
				if (a == CHAR_D) {
					out.add(sb.toString());
					sb = new StringBuffer();
					isDecode = true;
					in.discardReadBytes();
				}
			} else {
				out.add(sb.toString());
				sb = new StringBuffer();
				isDecode = true;
				in.discardReadBytes();
			}
		}
		if (!isDecode) {
			in.resetReaderIndex();
		}
	}
}
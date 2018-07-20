package com.scp.cmd.cygl.netty.server;

import com.scp.cmd.cygl.util.ByteUtil;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * 编码器 将String 编译为 Hex 16进制
 * 
 * @ClassName: ServerEncoder
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 青明锋
 * @date 2018年7月19日 上午1:51:43
 *
 */
public class ServerEncoder extends MessageToByteEncoder<String> {

	@Override
	protected void encode(ChannelHandlerContext ctx, String msg, ByteBuf out) throws Exception {
		msg = ByteUtil.str2HexStr(msg);
		out.writeBytes(Unpooled.copiedBuffer((msg).getBytes()));
	}

}

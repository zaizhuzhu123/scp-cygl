package com.scp.cmd.cygl.netty.server;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;

public class ServerOutboundHandler extends ChannelOutboundHandlerAdapter {

	private final Channel inboundChannel;

	public ServerOutboundHandler(Channel inboundChannel) {
		this.inboundChannel = inboundChannel;
	}

	protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
		// TODO Auto-generated method stub
		// 通过inboundChannel向客户端写入数据
		inboundChannel.writeAndFlush(msg).addListener(new ChannelFutureListener() {
			@Override
			public void operationComplete(ChannelFuture future) throws Exception {
				if (future.isSuccess()) {
					inboundChannel.close();
				} else {
					future.channel().close();
				}
			}
		});
	}

}

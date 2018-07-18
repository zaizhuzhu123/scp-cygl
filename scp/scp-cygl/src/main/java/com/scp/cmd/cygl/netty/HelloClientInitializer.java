package com.scp.cmd.cygl.netty;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("clientInitializer")
public class HelloClientInitializer extends ChannelInitializer<SocketChannel> {

	@Autowired
	HelloClientHandler clientHandler;

	@Override
	protected void initChannel(SocketChannel ch) throws Exception {
		ChannelPipeline pipeline = ch.pipeline();
		// 客户端的逻辑
		pipeline.addLast("handler", clientHandler);
	}
}
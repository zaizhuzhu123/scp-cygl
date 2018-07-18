package com.scp.cmd.cygl.netty.client;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("clientInitializer")
public class ClientInitializer extends ChannelInitializer<SocketChannel> {

	@Autowired
	ClientHandler clientHandler;

	@Override
	protected void initChannel(SocketChannel ch) throws Exception {
		ChannelPipeline pipeline = ch.pipeline();
		// 客户端的逻辑
		pipeline.addLast("handler", clientHandler);
	}
}
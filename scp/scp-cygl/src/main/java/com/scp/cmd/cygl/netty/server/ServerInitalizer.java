package com.scp.cmd.cygl.netty.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;

@Component
@Qualifier("springProtocolInitializer")
public class ServerInitalizer extends ChannelInitializer<SocketChannel> {

	@Autowired
	ServerHandler serverHandler;

	@Override
	protected void initChannel(SocketChannel ch) throws Exception {
		ChannelPipeline pipeline = ch.pipeline();
		pipeline.addLast("handler", serverHandler);
	}

	public ServerHandler getServerHandler() {
		return serverHandler;
	}

	public void setServerHandler(ServerHandler serverHandler) {
		this.serverHandler = serverHandler;
	}

}
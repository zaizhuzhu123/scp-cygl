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

	public static final int CHAR_NL = 10;
	public static final int CHAR_ER = 13;
	public static final int CHAR_D = 68;
	public static final int CHAR_BEGIN = 0;
	public static final int MESSAGE_LENGTH = 16;

	@Autowired
	ServerHandler serverHandler;

	@Override
	protected void initChannel(SocketChannel ch) throws Exception {
		ChannelPipeline pipeline = ch.pipeline();
		// decoder
		// 读半包的解码器

		// encoder
		pipeline.addLast(new ServerDecoder());
		pipeline.addLast(new ServerEncoder());
		pipeline.addLast("handler", serverHandler);
	}

	public ServerHandler getServerHandler() {
		return serverHandler;
	}

	public void setServerHandler(ServerHandler serverHandler) {
		this.serverHandler = serverHandler;
	}

}
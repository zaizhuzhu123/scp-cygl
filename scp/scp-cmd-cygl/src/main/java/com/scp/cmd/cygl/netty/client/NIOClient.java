package com.scp.cmd.cygl.netty.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NIOClient {
	@Autowired
	@Qualifier("clientBootstrap")
	private Bootstrap b;

	@Autowired
	@Qualifier("clientConnectionListener")
	private ClientConnectionListener clientConnectionListener;

	private Channel channel;

	// @PostConstruct
	// public void start() throws Exception {
	// // 连接服务端
	// try {
	// run();
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }

	public void run() throws InterruptedException {
		channel = b.connect().addListener(clientConnectionListener).sync().channel();
	}

	@PreDestroy
	public void stop() throws Exception {
		channel.close();
	}

	public Channel getChannel() {
		return channel;
	}

	public void write(String str) {
		ByteBuf resp = Unpooled.copiedBuffer(str.getBytes());
		channel.writeAndFlush(resp);
	}
}

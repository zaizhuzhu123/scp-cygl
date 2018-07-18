package com.scp.cmd.cygl.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NIOClient {
	@Autowired
	@Qualifier("clientBootstrap")
	private Bootstrap b;

	// 读取yml中配置
	@Value("${mml.host}")
	private String mml_host;

	@Value("${mml.port}")
	private int mml_port;

	private Channel channel;

	@PostConstruct
	public void start() throws Exception {
		// 连接服务端
		channel = b.connect(mml_host, mml_port).sync().channel();
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

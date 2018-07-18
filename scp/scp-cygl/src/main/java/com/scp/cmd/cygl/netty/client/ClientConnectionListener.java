package com.scp.cmd.cygl.netty.client;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.EventLoop;

@Component
@Qualifier("clientConnectionListener")
public class ClientConnectionListener implements ChannelFutureListener {

	private static final Logger log = LoggerFactory.getLogger(ClientHandler.class);

	@Autowired
	private NIOClient client;

	@Override
	public void operationComplete(ChannelFuture channelFuture) throws Exception {
		if (!channelFuture.isSuccess()) {
			log.info("尝试重新连接MML服务器");
			final EventLoop loop = channelFuture.channel().eventLoop();
			loop.schedule(new Runnable() {
				@Override
				public void run() {
					try {
						client.run();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}, 5L, TimeUnit.SECONDS);
		}
	}
}
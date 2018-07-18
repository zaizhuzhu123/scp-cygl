package com.scp.cmd.cygl.netty.client;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.EventLoop;

@Component
@Qualifier("clientConnectionListener")
public class ClientConnectionListener implements ChannelFutureListener {

	@Autowired
	private NIOClient client;

	@Override
	public void operationComplete(ChannelFuture channelFuture) throws Exception {
		if (!channelFuture.isSuccess()) {
			System.out.println("Reconnect");
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
			}, 1L, TimeUnit.SECONDS);
		}
	}
}
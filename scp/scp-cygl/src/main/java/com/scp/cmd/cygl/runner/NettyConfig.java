package com.scp.cmd.cygl.runner;

import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.scp.cmd.cygl.netty.client.ClientInitializer;
import com.scp.cmd.cygl.netty.server.ServerInitalizer;

import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @author 杨红星
 * @version 1.0.0
 */
@Configuration
public class NettyConfig {

	// 读取yml中配置
	@Value("${myserver.boss.thread.count}")
	private int myserver_bossCount;

	@Value("${myserver.worker.thread.count}")
	private int myserver_workerCount;

	@Value("${myserver.tcp.port}")
	private int myserver_tcpPort;

	@Value("${myserver.so.keepalive}")
	private boolean myserver_keepAlive;

	@Value("${myserver.so.backlog}")
	private int myserver_backlog;

	@Value("${mml.host}")
	private String mml_host;

	@Value("${mml.port}")
	private int mml_port;

	@Autowired
	@Qualifier("springProtocolInitializer")
	private ServerInitalizer protocolInitalizer;

	@Autowired
	@Qualifier("clientInitializer")
	private ClientInitializer clientInitializer;

	// bootstrap配置
	@SuppressWarnings("unchecked")
	@Bean(name = "serverBootstrap")
	public ServerBootstrap serverBootstrap() {
		ServerBootstrap b = new ServerBootstrap();
		b.group(bossGroup(), workerGroup()).channel(NioServerSocketChannel.class).childHandler(protocolInitalizer);
		Map<ChannelOption<?>, Object> tcpChannelOptions = tcpChannelOptions();
		Set<ChannelOption<?>> keySet = tcpChannelOptions.keySet();
		for (@SuppressWarnings("rawtypes")
		ChannelOption option : keySet) {
			b.option(option, tcpChannelOptions.get(option));
		}
		return b;
	}

	@SuppressWarnings("unchecked")
	@Bean(name = "clientBootstrap")
	public Bootstrap clientBootstrap() {
		Bootstrap b = new Bootstrap();
		b.group(clientGroup()).channel(NioSocketChannel.class).handler(clientInitializer);
		Map<ChannelOption<?>, Object> tcpChannelOptions = tcpChannelOptions();
		Set<ChannelOption<?>> keySet = tcpChannelOptions.keySet();
		for (@SuppressWarnings("rawtypes")
		ChannelOption option : keySet) {
			b.option(option, tcpChannelOptions.get(option));
		}
		b.remoteAddress(mml_host, mml_port);
		return b;
	}

	@Bean(name = "bossGroup", destroyMethod = "shutdownGracefully")
	public NioEventLoopGroup bossGroup() {
		return new NioEventLoopGroup(myserver_bossCount);
	}

	@Bean(name = "workerGroup", destroyMethod = "shutdownGracefully")
	public NioEventLoopGroup workerGroup() {
		return new NioEventLoopGroup(myserver_workerCount);
	}

	@Bean(name = "clientGroup", destroyMethod = "shutdownGracefully")
	public NioEventLoopGroup clientGroup() {
		return new NioEventLoopGroup(myserver_workerCount);
	}

	@Bean(name = "tcpSocketAddress")
	public InetSocketAddress tcpPort() {
		return new InetSocketAddress(myserver_tcpPort);
	}

	@Bean(name = "tcpChannelOptions")
	public Map<ChannelOption<?>, Object> tcpChannelOptions() {
		Map<ChannelOption<?>, Object> options = new HashMap<ChannelOption<?>, Object>();
		options.put(ChannelOption.SO_KEEPALIVE, myserver_keepAlive);
		options.put(ChannelOption.SO_BACKLOG, myserver_backlog);
		return options;
	}

	/**
	 * Necessary to make the Value annotations work.
	 *
	 * @return
	 */
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
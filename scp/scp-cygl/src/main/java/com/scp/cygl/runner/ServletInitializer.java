package com.scp.cygl.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 程序入口
 * 
 * @author qmf
 * 
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.scp.cygl")
@EntityScan(basePackages = "com.scp.cygl.pojo")
@EnableConfigurationProperties
@EnableScheduling
public class ServletInitializer extends SpringBootServletInitializer implements ApplicationListener<ContextRefreshedEvent> {

	/**
	 * War包入口
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ServletInitializer.class);
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
	}

	/**
	 * 程序测试入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(ServletInitializer.class);
		springApplication.setAdditionalProfiles("test");
		springApplication.run(args);
	}
}

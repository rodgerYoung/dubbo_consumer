package com.example.demo;

import com.example.demo.dubbo.service.ABCService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication implements EmbeddedServletContainerCustomizer{

	public static void main(String[] args)	 {
		System.err.println(System.currentTimeMillis());
		ConfigurableApplicationContext run=	SpringApplication.run(DemoApplication.class, args);
		ABCService bean=run.getBean(ABCService.class);
		System.err.println(bean.testService.str());
	}

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setPort(8086);
	}
}

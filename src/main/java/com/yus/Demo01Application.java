package com.yus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo01Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo01Application.class, args);
		Logger logger = LoggerFactory.getLogger(Demo01Application.class);
		logger.info("服务器启动了。。。。。。");

	}
}

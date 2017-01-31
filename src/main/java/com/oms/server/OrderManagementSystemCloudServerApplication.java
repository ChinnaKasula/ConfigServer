package com.oms.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class OrderManagementSystemCloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderManagementSystemCloudServerApplication.class, args);
	}
}

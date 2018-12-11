package com.sysco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FrdtWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrdtWsApplication.class, args);
	}
}

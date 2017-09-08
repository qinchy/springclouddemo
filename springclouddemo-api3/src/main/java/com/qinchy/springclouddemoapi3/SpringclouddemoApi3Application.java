package com.qinchy.springclouddemoapi3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringclouddemoApi3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringclouddemoApi3Application.class, args);
	}
}

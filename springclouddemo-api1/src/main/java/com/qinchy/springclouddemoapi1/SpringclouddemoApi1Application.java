package com.qinchy.springclouddemoapi1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringclouddemoApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringclouddemoApi1Application.class, args);
	}
}

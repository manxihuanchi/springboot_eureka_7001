package com.lhb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbootEureka7001Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEureka7001Application.class, args);
	}

}

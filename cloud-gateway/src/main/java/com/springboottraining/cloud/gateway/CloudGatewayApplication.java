package com.springboottraining.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@SpringBootApplication
@EnableEurekaClient
@CircuitBreaker(name = "CloudGateway")
public class CloudGatewayApplication {

	public static void main(String[] args) {
		// asking the application to use different property file (here applicaiton.yml
		// file is used
		// for app property as it was not picking up automatically) once run with
		// setting this and then commenting this, it keeps to read from this
		// System.setProperty("spring.config.name", "application");
		SpringApplication.run(CloudGatewayApplication.class, args);
	}

}

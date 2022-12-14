package com.mindtree.PatientMicroService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class PatientMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientMicroServiceApplication.class, args);
	}
	@Bean
	@LoadBalanced
	public RestTemplate restTemplete() {
		return new RestTemplate();
	}

}

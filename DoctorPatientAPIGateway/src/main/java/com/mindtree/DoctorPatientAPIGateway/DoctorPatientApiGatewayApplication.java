package com.mindtree.DoctorPatientAPIGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableEurekaClient
@CrossOrigin("*")
public class DoctorPatientApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorPatientApiGatewayApplication.class, args);
	}

}

package com.coachify.coachifyregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CoachifyRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoachifyRegistryApplication.class, args);
	}

}

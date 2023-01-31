package com.nerchuko.jenkinSample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinSampleApplication {
	
	public static Logger logger =LoggerFactory.getLogger(JenkinSampleApplication.class);

	public static void main(String[] args) {
		logger.info("application statrted in main method");

		SpringApplication.run(JenkinSampleApplication.class, args);

	}
	@PostConstruct
	public void init() {
		logger.info("application statrted in init method");
	}

}

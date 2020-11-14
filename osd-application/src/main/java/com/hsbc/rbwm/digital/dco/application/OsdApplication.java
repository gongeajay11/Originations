package com.hsbc.rbwm.digital.dco.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class OsdApplication {

	public static void main(String[] args) {
		SpringApplication.run(OsdApplication.class, args);
	}

}

package com.PersonalCRM.PersonalCRMRestAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages  = "com.PersonalCRM")
public class PersonalCrmRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalCrmRestApiApplication.class, args);
	}

}

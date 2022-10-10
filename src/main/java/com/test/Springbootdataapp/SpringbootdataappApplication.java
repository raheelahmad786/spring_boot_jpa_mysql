package com.test.Springbootdataapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.test.service","com.test.Springbootdataapp"})
@EntityScan("com.test.model")
@EnableJpaRepositories("com.test.repository")
public class SpringbootdataappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdataappApplication.class, args);
	}

}

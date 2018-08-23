package com.meitun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class CloudClient1Application {
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CloudClient1Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(CloudClient1Application.class, args);
	}
}

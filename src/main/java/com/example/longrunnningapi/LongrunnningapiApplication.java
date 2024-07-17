package com.example.longrunnningapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class LongrunnningapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LongrunnningapiApplication.class, args);
	}

}

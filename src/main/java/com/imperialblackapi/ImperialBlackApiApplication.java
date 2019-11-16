package com.imperialblackapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.imperialblackapi", "com.imperialblackapi.repository", "com.imperialblackapi.service", "com.imperialblackapi.controller"} )
public class ImperialBlackApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImperialBlackApiApplication.class, args);
	}

}

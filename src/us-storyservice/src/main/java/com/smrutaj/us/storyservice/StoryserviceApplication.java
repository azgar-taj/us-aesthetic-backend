package com.smrutaj.us.storyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class StoryserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoryserviceApplication.class, args);
	}

}

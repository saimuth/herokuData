package com.heroku.HerokuData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.heroku.HerokuData.controller.HerokuDataController;

@SpringBootApplication
//@EnableJpaRepositories(basePackages="com.heroku.HerokuData")
//@ComponentScan(basePackageClasses = HerokuDataController.class)
public class HerokuDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerokuDataApplication.class, args);
	}

}

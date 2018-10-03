package com.ApiStudy;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableRabbit
@ComponentScan ({"com.ApiStudy"})
public class Start {

	public static void main(String[] args) {
		SpringApplication.run(Start.class, args);
	
	}

}

package com.learnSpring.restApplication;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext arg){
		return args ->{
			System.out.println("Spring Application start");

			String[] beans = arg.getBeanDefinitionNames();
			Arrays.sort(beans);
			for(String bean : beans){
				System.out.println(bean);
			}
		};
	}

}

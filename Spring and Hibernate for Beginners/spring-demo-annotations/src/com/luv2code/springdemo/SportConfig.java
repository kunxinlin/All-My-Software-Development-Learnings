package com.luv2code.springdemo;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("com.luv2code.springdemo") //for XML bean creation
@PropertySource("classpath:sport.properties") //for injecting values from properties file
public class SportConfig {
	
	@Bean
	public FortuneService sadFortuneService() {
		return new  SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}

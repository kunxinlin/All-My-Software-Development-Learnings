package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	//field injection
	@Autowired
	private FortuneService fortuneService;
	
	
//	//constructor injection
//	@Autowired 
//	public TennisCoach(FortuneService fs) {
//		fortuneService = fs;
//	}
	
	public TennisCoach() {
	}
	
//	//setter injection
//	@Autowired
//	public void setFortuneService(FortuneService fs) {
//		fortuneService = fs;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}

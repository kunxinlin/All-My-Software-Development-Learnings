package com.luv2code.springdemo;

import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {
	//field injection
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	
	//constructor injection
//	@Autowired
//	public TennisCoach(FortuneService fs) {
//		fortuneService = fs;
//	}
	
	public TennisCoach() {
	}

	@PostConstruct
	public void doMyStartupStuff(){
		System.out.println("TennisCoach: start up...");
	}

	@PreDestroy
	public void doMyCleanupStuff(){
		System.out.println("TennisCoach: clean up...");
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

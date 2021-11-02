package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fs;
	
	//field injection
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(FortuneService fortuneService) {
		fs = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 100 meters";
	}

	@Override
	public String getDailyFortune() {
		return fs.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	

}

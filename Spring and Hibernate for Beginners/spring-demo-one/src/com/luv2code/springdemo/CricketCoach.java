package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String email;
	private String team;
	
	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		System.out.println("inside CricketCoach setEmail");
		this.email = email;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		System.out.println("inside CricketCoach setTeam");
		this.team = team;
	}



	public CricketCoach() {
		System.out.println("CricketCoach: inside constructor");
	}
	

	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		return "Cricket Practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

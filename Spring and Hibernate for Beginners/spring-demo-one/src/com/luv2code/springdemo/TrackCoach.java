package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	//define a private field for the dependency
	private FortuneService fortuneService;

	public TrackCoach() {
		
	}
	
	//constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	//init method
	public void doMyStartupStuff() {
		System.out.println("Track Coach: startup");
	}
	
	//destroy method
	public void myCleanup() {
		System.out.println("Track Coach: cleanup");
	}
	

}











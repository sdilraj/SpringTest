package com.spring;

public class BaseballCoach implements Coach {
	
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for the dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	
	
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 mins on batting practice";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	

}

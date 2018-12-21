package com.spring;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	public TrackCoach() {
		
	}
	
	
	public TrackCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	
	
	@Override 
	public String getDailyWorkout() {
		return "run 3 files";
	}
	
	
	public String getDailyFortune() {
		return "today is a hot day";
	}


}

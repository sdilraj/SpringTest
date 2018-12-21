package com.spring;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// new fields for emailAddress and team
	private String emailAddress;
	private String team;
	
	
	
	//create no-arg construtor
	public CricketCoach() {
		System.out.println("Cricket Coach inside no-arg Construtor");
	}
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket Coach: inside setter method- set EmailAddress");
		this.emailAddress = emailAddress;
	}
	
	
	public String getTeam() {
		return team;
	}
	
	public void setTeam(String team) {
		System.out.println("Cricket Coach: inside setter method- set Team");
		this.team = team;
	}
	
	
	
	//setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach: inside setter method- set Fortune Service");
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice Fast Bowling";
	}

	@Override
	public String getDailyFortune() {
		return "It's  a rainy cricket day";
	}

}

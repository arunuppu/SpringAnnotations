package com.practice;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService){
		fortuneService =theFortuneService; 
	}
	@Override
	public String getDailyWorkout() {
		return "Swim 5 min for warmup";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

package com.practice;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	//create an array of strings
	private String[] data ={
			"This is a practice session from Udemy",
			"This is a sample project for annotations demo",
			"My name is so n so"			
	};
	
	//crate a random number generator 
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		//pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		return theFortune;
	}

}

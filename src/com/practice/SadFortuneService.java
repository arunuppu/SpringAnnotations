package com.practice;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Sad Message from getFortune()";
	}

}

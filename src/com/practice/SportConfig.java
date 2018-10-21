package com.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.practice")
public class SportConfig {

	// define bean for  sadfortuneservice
	@Bean
	public FortuneService sadFortuneService(){
		return new SadFortuneService();
	}
	
	//define bean for swimcoach and inject bean
	@Bean
	public Coach swimCoach(){
		return new SwimCoach(sadFortuneService());
	}
	
}

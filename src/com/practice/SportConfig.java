package com.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.practice")
@PropertySource("classpath:sport.properties")
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

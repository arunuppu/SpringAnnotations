package com.practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// read string config file
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);

		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call a method on to get daily fortune
		System.out.println(theCoach.getDailyFortune());

		//new swimcoach methods
		System.out.println("eamil: "+theCoach.getEmail());
		System.out.println("team: "+theCoach.getTeam());
		// close the context
		context.close();
	}

}

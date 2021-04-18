package com.shadow;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		TestService testService = ac.getBean(TestService.class);
		System.out.println(testService.getClass().getName());
	}
}

package com.example.Annotation;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AnnApplication {

	public static void main(String[] args) {
		// Способ 2.  Внедрение зависимостей через xml annotation
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnn.xml");
		Car car = context.getBean(Car.class);
		System.out.println(car);
	}

}

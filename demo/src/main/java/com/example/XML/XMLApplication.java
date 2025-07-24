package com.example.XML;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class XMLApplication {

	public static void main(String[] args) {
		// Способ 1.  Внедрение зависимостей через xml
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car = context.getBean("car", Car.class);
		System.out.println(car);
	}

}

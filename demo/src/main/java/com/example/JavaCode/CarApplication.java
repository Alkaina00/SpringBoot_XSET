package com.example.JavaCode;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CarApplication {
	public static void main(String[] args) {
		SpringApplication.run(CarApplication.class, args);
	}

	@Bean
	CommandLineRunner demo(Car car) {
		return args -> {
			System.out.println("Автомобиль создан через Java Config:");
			System.out.println(car);
		};
	}
}

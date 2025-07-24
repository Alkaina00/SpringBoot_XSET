package com.example.JavaCode;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CarApplication {

	public static void main(String[] args) {
		// Способ 3.  Внедрение зависимостей через java code
		SpringApplication.run(CarApplication.class, args);
	}

	@Bean
	CommandLineRunner demo(Car car, Wheel wheel, Engine engine, Accumulator accumulator,
						   Suspension suspension, Starter starter, SparkPlug sparkPlug,
						   Hinge hinge, Differential differential) {
		return args -> {
			wheel.setBrand("Michelin");
			wheel.setSize(17);

			starter.setModel("Bosch X500");

			sparkPlug.setType("Iridium");

			hinge.setMaterial("Steel");
			hinge.setCount(4);

			differential.setType("Limited Slip");

			accumulator.setCapacity(60);
			accumulator.setTechnology("Lithium-Ion");

			engine.setPower(200);

			suspension.setSuspensionType("Multi-Link");

			car.setModel("Tesla Model 3");

			System.out.println("Car object created with Spring Boot:");
			System.out.println(car);
		};
	}

}

package com.example.JavaCode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // 1. Компоненты двигателя
    @Bean
    public SparkPlug sparkPlug() {
        SparkPlug sparkPlug = new SparkPlug();
        sparkPlug.setType("Iridium");
        return sparkPlug;
    }

    @Bean
    public Starter starter() {
        Starter starter = new Starter();
        starter.setModel("Bosch X12");
        return starter;
    }

    @Bean
    public Engine engine() {
        Engine engine = new Engine(starter(), sparkPlug());
        engine.setPower(150);
        return engine;
    }

    // 2. Колесо
    @Bean
    public Wheel wheel() {
        Wheel wheel = new Wheel();
        wheel.setBrand("Michelin");
        wheel.setSize(17);
        return wheel;
    }

    // 3. Аккумулятор
    @Bean
    public Accumulator accumulator() {
        Accumulator accumulator = new Accumulator();
        accumulator.setCapacity(60);
        accumulator.setTechnology("Li-Ion");
        return accumulator;
    }

    // 4. Подвеска
    @Bean
    public Hinge hinge() {
        Hinge hinge = new Hinge();
        hinge.setMaterial("Steel");
        hinge.setCount(4);
        return hinge;
    }

    @Bean
    public Differential differential() {
        Differential differential = new Differential();
        differential.setType("Limited Slip");
        return differential;
    }

    @Bean
    public Suspension suspension() {
        Suspension suspension = new Suspension(hinge(), differential());
        suspension.setSuspensionType("Multi-link");
        return suspension;
    }

    // 5. Автомобиль
    @Bean
    public Car car() {
        Car car = new Car(wheel(), engine(), accumulator(), suspension());
        car.setModel("Toyota Camry");
        return car;
    }
}

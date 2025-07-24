package com.example.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired
    private Wheel wheel;
    @Autowired
    private Engine engine;
    @Autowired
    private Accumulator accumulator;
    @Autowired
    private Suspension suspension;
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{\n" +
                "  model='" + model + "',\n" +
                "  wheel=" + wheel + ",\n" +
                "  engine=" + engine + ",\n" +
                "  accumulator=" + accumulator + ",\n" +
                "  suspension=" + suspension + "\n" +
                "}";
    }
}

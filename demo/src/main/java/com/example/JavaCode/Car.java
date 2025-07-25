package com.example.JavaCode;


public class Car {
    private final Wheel wheel;
    private final Engine engine;
    private final Accumulator accumulator;
    private final Suspension suspension;
    private String model = "Default Model";

    public Car(Wheel wheel, Engine engine, Accumulator accumulator, Suspension suspension) {
        this.wheel = wheel;
        this.engine = engine;
        this.accumulator = accumulator;
        this.suspension = suspension;
    }

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

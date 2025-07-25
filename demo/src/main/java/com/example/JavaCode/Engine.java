package com.example.JavaCode;


public class Engine {
    private Starter starter;
    private SparkPlug sparkPlug;
    private int power = 150;

    public Engine(Starter starter, SparkPlug sparkPlug) {
        this.starter = starter;
        this.sparkPlug = sparkPlug;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{starter=" + starter + ", sparkPlug=" + sparkPlug + ", power=" + power + "}";
    }
}

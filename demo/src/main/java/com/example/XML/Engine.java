package com.example.XML;

public class Engine {
    private Starter starter;
    private SparkPlug sparkPlug;
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Starter getStarter() {
        return starter;
    }

    public void setStarter(Starter starter) {
        this.starter = starter;
    }

    public SparkPlug getSparkPlug() {
        return sparkPlug;
    }

    public void setSparkPlug(SparkPlug sparkPlug) {
        this.sparkPlug = sparkPlug;
    }

    @Override
    public String toString() {
        return "Engine{starter=" + starter + ", sparkPlug=" + sparkPlug + ", power=" + power + "}";
    }
}

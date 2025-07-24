package com.example.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    @Autowired
    private Starter starter;
    @Autowired
    private SparkPlug sparkPlug;
    private int power;

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

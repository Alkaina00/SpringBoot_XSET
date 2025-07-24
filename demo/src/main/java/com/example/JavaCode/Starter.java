package com.example.JavaCode;

import org.springframework.stereotype.Component;

@Component
public class Starter {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString() {
        return "Starter{model='" + model + "'}";
    }
}

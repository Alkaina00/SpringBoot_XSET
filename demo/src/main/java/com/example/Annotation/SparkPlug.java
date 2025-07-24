package com.example.Annotation;

import org.springframework.stereotype.Component;

@Component
public class SparkPlug {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SparkPlug{type='" + type + "'}";
    }
}

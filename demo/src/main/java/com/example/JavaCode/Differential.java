package com.example.JavaCode;


public class Differential {
    private String type = "Limited Slip";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Differential{type='" + type + "'}";
    }
}

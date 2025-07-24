package com.example.XML;

public class Accumulator {
    private int capacity;
    private String technology;

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Accumulator{capacity=" + capacity + ", technology='" + technology + "'}";
    }
}

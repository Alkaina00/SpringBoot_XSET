package com.example.XML;

public class Wheel {
    private String brand;
    private int size;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Wheel{brand='" + brand + "', size=" + size + "}";
    }
}

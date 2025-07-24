package com.example.JavaCode;

import org.springframework.stereotype.Component;

@Component
public class Hinge {
    private String material;
    private int count;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    @Override
    public String toString() {
        return "Hinge{material='" + material + "', count=" + count + "}";
    }
}

package com.example.JavaCode;

import org.springframework.stereotype.Component;

@Component
public class Suspension {
    private Hinge hinge;
    private Differential differential;
    private String suspensionType = "Independent";

    public Suspension(Hinge hinge, Differential differential) {
        this.hinge = hinge;
        this.differential = differential;
    }

    public String getSuspensionType() {
        return suspensionType;
    }

    public void setSuspensionType(String suspensionType) {
        this.suspensionType = suspensionType;
    }

    @Override
    public String toString() {
        return "Suspension{hinge=" + hinge + ", differential=" + differential +
                ", suspensionType='" + suspensionType + "'}";
    }
}

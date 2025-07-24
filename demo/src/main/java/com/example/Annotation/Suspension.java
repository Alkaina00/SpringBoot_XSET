package com.example.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Suspension {
    @Autowired
    private Hinge hinge;
    @Autowired
    private Differential differential;
    private String suspensionType;

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

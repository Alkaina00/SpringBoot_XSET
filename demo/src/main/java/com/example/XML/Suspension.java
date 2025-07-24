package com.example.XML;

public class Suspension {
    private Hinge hinge;
    private Differential differential;
    private String suspensionType;

    public Differential getDifferential() {
        return differential;
    }

    public void setDifferential(Differential differential) {
        this.differential = differential;
    }

    public Hinge getHinge() {
        return hinge;
    }

    public void setHinge(Hinge hinge) {
        this.hinge = hinge;
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

package com.company;

public class Driver {
    private String name;
    private int license;

    public Driver() {

    }

    public Driver(String name, int license) {
        this.name = name;
        this.license = license;
    }

    public int getLicense() {
        return license;
    }

    public void setLicense(int license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", license=" + license +
                '}';
    }
}

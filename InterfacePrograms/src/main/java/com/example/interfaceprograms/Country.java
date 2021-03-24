package com.example.interfaceprograms;

public class Country implements Measureable {

    private double area;
    private String country;

    public Country(){

    }

    public Country(String country, double area) {
        this.country = country;
        this.area = area;
    }

    public double getMeasure() {
        return area;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double setArea() {
        return area;


    }



}

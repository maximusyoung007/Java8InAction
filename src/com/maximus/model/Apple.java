package com.maximus.model;

public class Apple {
    private String weight;

    private String color;

    public Apple(){}

    public Apple(String weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

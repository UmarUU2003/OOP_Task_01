package models;

import models.enums.Transmission;

public class Car {
    private String color;
    private String model;
    private double price;
    private Transmission transmission;

    public Car(String color, String model, double price, Transmission transmission) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.transmission = transmission;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car [" +
                "color : '" + color + '\'' +
                ", model : '" + model + '\'' +
                ", price : " + price +
                ", transmission : " + transmission +
                ']';
    }
}

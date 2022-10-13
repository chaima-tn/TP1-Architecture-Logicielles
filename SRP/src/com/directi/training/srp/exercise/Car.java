package com.directi.training.srp.exercise;

public class Car extends Model implements Comparable<Car> {
    private final String _model;
    private final String _brand;

    public Car(String id, String model, String brand) {
        super(id);
        _model = model;
        _brand = brand;
    }

    public String getModel() {
        return _model;
    }

    public String getBrand() {
        return _brand;
    }

    @Override
    public int compareTo(Car other) {
        return this.getModel().compareTo(other.getModel());
    }
}

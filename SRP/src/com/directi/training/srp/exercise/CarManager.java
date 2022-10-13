package com.directi.training.srp.exercise;

public class CarManager
{
    private DB<Car> _db;

    public CarManager(DB<Car> db){
        _db = db;
    }

    public String getCarsNames()
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : _db.getAll()) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : _db.getAll()) {
            if (bestCar == null || car.compareTo(bestCar) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}

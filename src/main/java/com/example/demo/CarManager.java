package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarManager {

    private List<Car>carList;

    public CarManager() {
        this.carList = new ArrayList<>();
        carList.add(new Car("BMW", "325"));
        carList.add(new Car("Audi", "A4"));
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public boolean addCar( Car car) {
        return carList.add(car);
    }
}

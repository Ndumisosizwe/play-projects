package com.nmhlogo.jee.dao;

import com.nmhlogo.jee.jaxrs.webservice.rest.webservice.Car;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Named
@RequestScoped
public class CarDao {

    private List<Car> cars = Arrays.asList(
            new Car("BMW", "2008"),
            new Car("Kia Stinger", "2018"),
            new Car("BMW 740i V12", "1994")
    );

    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }

    public Car getById(UUID id) {
        return this.cars.stream()
                .filter(car -> id.toString().equals(car.getId()))
                .findAny()
                .orElse(null);
    }
}

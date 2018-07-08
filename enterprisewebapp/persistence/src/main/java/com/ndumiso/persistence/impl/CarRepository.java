package com.ndumiso.persistence.impl;

import com.ndumiso.domain.entity.Car;
import com.ndumiso.persistence.DomainObjectDao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.*;

@Named("carResource")
@RequestScoped
public class CarRepository implements DomainObjectDao<Car> {

    private final static Map<String, Car> CAR_DATABASE;

    static {
        CAR_DATABASE = new HashMap<>();
        Car fordFigo = Car.builder()
                .brand("FORD FIGO")
                .year("2014")
                .build();
        Car bmw = Car.builder()
                .brand("BMW")
                .year("2001")
                .build();
        CAR_DATABASE.put(fordFigo.getId(), fordFigo);
        CAR_DATABASE.put(bmw.getId(), bmw);
    }

    @Override
    public Car save(Car entity) {
        CAR_DATABASE.put(entity.getId(), entity);
        return CAR_DATABASE.get(entity.getId());
    }

    @Override
    public Optional<Car> getById(String id) {
        return Optional.ofNullable(CAR_DATABASE.get(id));
    }

    @Override
    public List<Car> getAll() {
        return new ArrayList<>(CAR_DATABASE.values());
    }
}

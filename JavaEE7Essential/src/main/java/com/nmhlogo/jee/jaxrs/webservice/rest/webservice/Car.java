package com.nmhlogo.jee.jaxrs.webservice.rest.webservice;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Car {

    @Id
    private String id = UUID.randomUUID().toString();

    private String brand;
    private String year;

    public Car() {
    }

    public Car(String brand, String year) {
        this.brand = brand;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}

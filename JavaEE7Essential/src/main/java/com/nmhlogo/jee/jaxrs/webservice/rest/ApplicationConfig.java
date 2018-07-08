package com.nmhlogo.jee.jaxrs.webservice.rest;

import com.nmhlogo.jee.jaxrs.webservice.rest.webservice.CarResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("api/v1/resource")
public class ApplicationConfig extends Application {

    private Set<Class<?>> resources = new HashSet<>();

    {
        resources.add(CarResource.class);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return resources;
    }
}

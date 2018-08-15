package com.ndumiso.jaxrs.config;


import com.ndumiso.jaxrs.resource.CarResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("api/v1/resource")
public class ApplicationConfig extends Application {

    private Set<Class<?>> resources = new HashSet<>(Arrays.asList(
            CarResource.class
    ));

    @Override
    public Set<Class<?>> getClasses() {
        return resources;
    }
}

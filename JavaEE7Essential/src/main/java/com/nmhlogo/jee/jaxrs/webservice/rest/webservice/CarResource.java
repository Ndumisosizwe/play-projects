package com.nmhlogo.jee.jaxrs.webservice.rest.webservice;

import com.nmhlogo.jee.dao.CarDao;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.UUID;

@Path("cars")
@Produces(MediaType.APPLICATION_JSON)
public class CarResource {

    @Inject
    private CarDao carDao;

    @GET
    public List<Car> getAll() {
        return carDao.getAllCars();
    }


    @GET
    @Path("/{id}")
    public Car getById(@PathParam("id") UUID id) {
        return carDao.getById(id);
    }

}

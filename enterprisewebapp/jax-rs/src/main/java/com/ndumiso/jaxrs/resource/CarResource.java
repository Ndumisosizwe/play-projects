package com.ndumiso.jaxrs.resource;

import com.ndumiso.business.DomainService;
import com.ndumiso.domain.entity.Car;
import com.ndumiso.persistence.DomainObjectDao;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Qualifier;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;


/**
 * Car resource
 *
 * @author Ndumiso
 */

@Path("cars")
@Produces(MediaType.APPLICATION_JSON)
public class CarResource {


    @Inject
    @Named("carResource")
    private DomainObjectDao<Car> carResource;

    @EJB
    private DomainService domainService;

    @GET
    public List<Car> getAll() {
        domainService.printMessage();
        return carResource.getAll();
    }
}

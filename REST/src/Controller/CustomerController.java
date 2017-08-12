package Controller;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/customers")
@ApplicationPath("/resources")
public class CustomerController extends Application {

	@GET
	@Path("/getName")
	@Produces(MediaType.APPLICATION_JSON)
	public Response customerName() {
		return Response.ok(new Customer(1, "Ndumiso")).build();
	}

}

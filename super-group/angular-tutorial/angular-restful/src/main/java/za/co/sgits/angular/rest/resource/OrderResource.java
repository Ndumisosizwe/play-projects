package za.co.sgits.angular.rest.resource;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import za.co.sgits.angular.persistence.entity.Order;

@Produces ( MediaType.APPLICATION_JSON )
@Path ( "order" )
public class OrderResource {

	@EJB
	private OrderService orderService;

	@GET
	@Path ( "getOrders" )
	public Response findAllOrders() {
		List< Order > orders = new LinkedList<>();
		Order e = new Order( new Date().toString(), "Box of Bananas" );
		orders.add( e );
		Order e2 = new Order( new Date().toString(), "Box of Computers" );
		e.setId( 12 );
		e2.setId( 13 );
		orders.add( e2 );
		return Response.ok( orders ).build();
	}
}

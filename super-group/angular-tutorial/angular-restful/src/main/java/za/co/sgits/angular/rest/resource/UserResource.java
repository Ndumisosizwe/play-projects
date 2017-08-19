/**
 * 
 */
package za.co.sgits.angular.rest.resource;

import java.util.logging.Level;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import za.co.sgits.angular.rest.entity.Count;
import za.co.sgits.angular.service.dto.UserDTO;
import za.co.sgits.angular.service.ejb.UserServiceLocal;
import za.co.sgits.angular.service.exception.ServiceException;

/**
 * @author buhake.sindi
 * @since 2017/08/17
 *
 */
@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource extends AbstractResource {

	@EJB
	private UserServiceLocal userService;
	
	@GET
	@Path("/count")
	public Count countAllCustomers() {
		try {
			return new Count(userService.countAllUsers());
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			LOGGER.log(Level.SEVERE, e.getLocalizedMessage(), e);
			throw toWebApplicationException(e);
		} catch (RuntimeException e) {
			LOGGER.log(Level.SEVERE, e.getLocalizedMessage(), e);
			throw toWebApplicationException(e);
		}
	}
	
	@GET
	@Path("/{id:\\d+}")
	public UserDTO getUser(@PathParam("id") final int userId) {
		try {
			return userService.findUser(userId);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			throw toWebApplicationException(e);
		} catch (RuntimeException e) {
			throw toWebApplicationException(e);
		}
		
	}
	
}

/**
 * 
 */
package za.co.sgits.angular.service;

import java.util.Collection;

import javax.validation.constraints.NotNull;

import za.co.sgits.angular.service.dto.UserDTO;
import za.co.sgits.angular.service.exception.ServiceException;

/**
 * @author buhake.sindi
 * @since 2017/08/17
 *
 */
public interface UserService {

	public long countAllUsers() throws ServiceException;
	
	public long createNewUser(@NotNull final String firstName, @NotNull final String surname, @NotNull final String emailAddress) throws ServiceException;
	
	public Collection<UserDTO> findAllUsers() throws ServiceException;
	public Collection<UserDTO> findAllUsers(Integer startPosition, Integer maxResults) throws ServiceException;

	public UserDTO findUser(final int userId) throws ServiceException;
	
	public UserDTO findUser(final String emailAddress) throws ServiceException;
	
	public void updateExistingUser(@NotNull final int userId, @NotNull final String firstName, @NotNull final String surname, final String emailAddress) throws ServiceException;
}

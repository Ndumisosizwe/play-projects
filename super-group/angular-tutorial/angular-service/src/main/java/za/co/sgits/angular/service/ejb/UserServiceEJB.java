/**
 * 
 */
package za.co.sgits.angular.service.ejb;

import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.ejb.Stateless;
import javax.inject.Inject;

import za.co.sgits.angular.persistence.dao.UserDAO;
import za.co.sgits.angular.persistence.entity.User;
import za.co.sgits.angular.service.UserService;
import za.co.sgits.angular.service.dto.UserDTO;
import za.co.sgits.angular.service.exception.ServiceException;

/**
 * @author buhake.sindi
 * @since 2017/08/17
 *
 */
@Stateless
public class UserServiceEJB implements UserServiceLocal, UserServiceRemote, UserService {

	@Inject
	private UserDAO userDAO;
	
	private Function<User, UserDTO> mapUser() {
		
		return new Function<User, UserDTO>() {

			/* (non-Javadoc)
			 * @see java.util.function.Function#apply(java.lang.Object)
			 */
			@Override
			public UserDTO apply(User user) {
				// TODO Auto-generated method stub
				UserDTO userDTO = new UserDTO();
				userDTO.setEmailAddress(user.getEmailAddress());
				userDTO.setFirstName(user.getFirstName());
				userDTO.setSurname(user.getSurname());
				userDTO.setId(user.getId());
				
				return userDTO;
			}
		};
	}
	
	/* (non-Javadoc)
	 * @see za.co.sgits.angular.service.UserService#countAllUsers()
	 */
	@Override
	public long countAllUsers() throws ServiceException {
		// TODO Auto-generated method stub
		return userDAO.countAll();
	}

	/* (non-Javadoc)
	 * @see za.co.sgits.angular.service.UserService#createNewUser(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public long createNewUser(String firstName, String surname, String emailAddress) throws ServiceException {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see za.co.sgits.angular.service.UserService#findAllUsers()
	 */
	@Override
	public Collection<UserDTO> findAllUsers() throws ServiceException {
		// TODO Auto-generated method stub
		Collection<User> users = userDAO.findAll();
		if (users == null) {
			return null;
		}
		
		return users.stream().map(mapUser()).collect(Collectors.toList());
	}

	/* (non-Javadoc)
	 * @see za.co.sgits.angular.service.UserService#findAllUsers(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public Collection<UserDTO> findAllUsers(Integer startPosition, Integer maxResults) throws ServiceException {
		// TODO Auto-generated method stub
		Collection<User> users = userDAO.findAll(startPosition, maxResults);
		if (users == null) {
			return null;
		}
		
		return users.stream().map(mapUser()).collect(Collectors.toList());
	}

	/* (non-Javadoc)
	 * @see za.co.sgits.angular.service.UserService#findUser(int)
	 */
	@Override
	public UserDTO findUser(int userId) throws ServiceException {
		// TODO Auto-generated method stub
		return mapUser().apply(userDAO.find(userId));
	}

	/* (non-Javadoc)
	 * @see za.co.sgits.angular.service.UserService#findUser(java.lang.String)
	 */
	@Override
	public UserDTO findUser(String emailAddress) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see za.co.sgits.angular.service.UserService#updateExistingUser(int, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void updateExistingUser(int userId, String firstName, String surname, String emailAddress) throws ServiceException {
		// TODO Auto-generated method stub

	}
}

/**
 * 
 */
package za.co.sgits.angular.service.ejb;

import javax.ejb.Remote;

import za.co.sgits.angular.service.UserService;

/**
 * @author buhake.sindi
 * @since 2017/08/17
 *
 */
@Remote
public interface UserServiceRemote extends UserService {

}

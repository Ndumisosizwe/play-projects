/**
 * 
 */
package za.co.sgits.angular.persistence.dao.impl;

import za.co.sgits.angular.persistence.dao.JPAGenericDAO;
import za.co.sgits.angular.persistence.dao.UserDAO;
import za.co.sgits.angular.persistence.entity.User;

/**
 * @author buhake.sindi
 * @since 2017/08/17
 *
 */
public class UserJPADAO extends JPAGenericDAO< User,Integer > implements UserDAO {

	/**
	 * 
	 */
	public UserJPADAO ( ) {
		super( User.class );
		// TODO Auto-generated constructor stub
	}
}

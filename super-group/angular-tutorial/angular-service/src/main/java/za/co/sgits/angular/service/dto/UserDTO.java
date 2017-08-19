/**
 * 
 */
package za.co.sgits.angular.service.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author buhake.sindi
 * @since 2016/01/21
 *
 */
@XmlRootElement(name="user")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1889834512418795345L;

	@XmlElement
	private int id;
	
	@XmlElement(name="first_name")
	private String firstName;
	
	@XmlElement
	private String surname;
	
	@XmlElement(name="email_address")
	private String emailAddress;
	
	/* (non-Javadoc)
	 * @see za.co.sgits.ecommerce.service.dto.IDBasedDTO#getId()
	 */
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	/* (non-Javadoc)
	 * @see za.co.sgits.ecommerce.service.dto.IDBasedDTO#setId(java.io.Serializable)
	 */
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}

/**
 * 
 */
package za.co.sgits.angular.persistence.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author buhake.sindi
 * @since 2017/08/17
 *
 */
@Entity
@Table(name="USERS")
@Cacheable
@Access(AccessType.FIELD)
public class User implements za.co.sgits.angular.persistence.entity.Entity<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3871550267981446740L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	@Access(AccessType.PROPERTY)
	private int id;
	
	@Column(name="FIRST_NAME", nullable=false)
	@Access(AccessType.PROPERTY)
	private String firstName;
	
	@Column(name="SURNAME", nullable=false)
	@Access(AccessType.PROPERTY)
	private String surname;
	
	@Column(name="EMAIL_ADDRESS", nullable=false, unique=true)
	@Access(AccessType.PROPERTY)
	private String emailAddress;
	
	/* (non-Javadoc)
	 * @see za.co.sgits.angular.persistence.entity.Entity#isNew()
	 */
	@Override
	public boolean isNew() {
		// TODO Auto-generated method stub
		return id == 0;
	}
	
	/* (non-Javadoc)
	 * @see za.co.sgits.angular.persistence.entity.Entity#getId()
	 */
	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}

	/* (non-Javadoc)
	 * @see za.co.sgits.angular.persistence.entity.Entity#setId(java.io.Serializable)
	 */
	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		this.id = (id == null ? 0 : id);
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

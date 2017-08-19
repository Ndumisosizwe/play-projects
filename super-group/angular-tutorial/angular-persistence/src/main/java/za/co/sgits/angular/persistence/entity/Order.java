package za.co.sgits.angular.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Order {

	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY )
	private long id;

	@Column
	private String orderDate;

	@Column
	private String orderDetails;

	public Order ( ) {
	}

	public Order ( String orderDate, String orderDetails ) {
		this.orderDate = orderDate;
		this.orderDetails = orderDetails;
	}

	public long getId() {
		return id;
	}

	public void setId( long id ) {
		this.id = id;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate( String orderDate ) {
		this.orderDate = orderDate;
	}

	public String getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails( String orderDetails ) {
		this.orderDetails = orderDetails;
	}
}

package za.co.sgits.angular.rest.resource;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import za.co.sgits.angular.persistence.entity.Order;

@Stateless
public class OrderRepositoryImpl implements OrderRepository {

	@PersistenceContext ( unitName = "angular_pu" )
	private EntityManager entityManager;

	@Override
	public List< Order > getAllOrders() {
		List< Order > orders = entityManager.createNativeQuery( "SELECT * FROM ORDERS", Order.class ).getResultList();
		return orders;
	}
}

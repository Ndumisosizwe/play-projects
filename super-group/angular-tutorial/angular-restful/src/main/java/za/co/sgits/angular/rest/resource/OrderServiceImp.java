package za.co.sgits.angular.rest.resource;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import za.co.sgits.angular.persistence.entity.Order;

@Stateless
public class OrderServiceImp implements OrderService {

	@EJB
	private OrderRepository orderResoure;

	@Override
	public List< Order > getAllOrders() {
		return orderResoure.getAllOrders();
	}
}

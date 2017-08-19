package za.co.sgits.angular.rest.resource;

import java.util.List;

import javax.ejb.Local;

import za.co.sgits.angular.persistence.entity.Order;

@Local
public interface OrderRepository {

	List< Order > getAllOrders();
}

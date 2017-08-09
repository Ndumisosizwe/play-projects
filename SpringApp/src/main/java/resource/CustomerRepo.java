package resource;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import beans.Customer;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Long> {

	List<Customer> findByNameOrderById(String name);
}

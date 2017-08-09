package resource;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import beans.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

}

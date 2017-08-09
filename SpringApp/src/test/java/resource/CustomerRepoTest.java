package resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import beans.Customer;
import beans.PersistenceConfig;
import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PersistenceConfig.class)
public class CustomerRepoTest extends TestCase {

	@Autowired
	private CustomerRepo repo;

	@Test
	public void testCustomerRepoShouldNotBeNull() {
		Customer customer = new Customer("James Saint-Patrick");
		Customer customer2 = repo.save(customer);
		
		assertNotNull(customer2);
	}

}

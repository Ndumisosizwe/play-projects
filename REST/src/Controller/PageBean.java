package Controller;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

@ManagedBean
@ApplicationScoped
public class PageBean {
	
	public void call() {
		Client client = ClientBuilder.newClient();
		System.out
				.println(client.target("http://localhost:8080/REST/resources/customers/getName").request().get(Customer.class));
	}

}

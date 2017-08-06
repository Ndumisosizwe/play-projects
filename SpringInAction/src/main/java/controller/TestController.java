package controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestController {

	@Bean
	public Customer index() {
		return new Customer();
	}

}

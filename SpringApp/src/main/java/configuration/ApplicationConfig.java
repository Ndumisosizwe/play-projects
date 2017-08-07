package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.CustomerObj;

@Configuration
public class ApplicationConfig {

	@Bean(name="MrBean", initMethod="printInit", destroyMethod="destroy")
	public CustomerObj customerBean() {
		return new CustomerObj();
	}

}

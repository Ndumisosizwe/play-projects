package application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import controller.Customer;

@ComponentScan(basePackages = { "controller.TestController" })
public class Appplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("controller", "application");
		Customer customer = (Customer)context.getBean("index");
		System.out.println(customer.getName());
		context.close();
	}

}

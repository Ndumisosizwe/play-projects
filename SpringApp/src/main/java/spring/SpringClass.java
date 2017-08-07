package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.CustomerObj;

public class SpringClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("configuration");
		CustomerObj customerObj = (CustomerObj) context.getBean("MrBean");
		System.out.println(customerObj);
		context.close();
	}

}

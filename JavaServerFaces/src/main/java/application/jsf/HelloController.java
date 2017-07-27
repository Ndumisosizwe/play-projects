package application.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloController", eager = true)
public class HelloController {
	public HelloController() {
		System.out.println("Bean started");
	}

	public String message() {
		return "Bean Hello World";
	}
}

package Controller;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

	private long id;

	private String name;

	public Customer() {
	}

	public Customer(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

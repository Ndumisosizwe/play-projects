package beans;

public class CustomerObj {

	private String name;

	private String id;

	public CustomerObj() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void printInit() {
		System.out.println("Init method called....");
	}

	public void destroy() {
		System.out.println("time to destroy the beans");
		try {
			finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

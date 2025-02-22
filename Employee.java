public abstract class Employee {
	protected static int counter;

	protected String name;
	protected String email;
	protected int ssNo;

	public Employee(String email, String name, int ssNo) {
		this.email = email;
		this.name = name;
		this.ssNo = ssNo;

		counter++;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public int getCounter() {
		return this.counter;
	}

	/**
	 * 
	 * @param counter
	 */
	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getSsNo() {
		return this.ssNo;
	}
}
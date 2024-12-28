import java.util.List;

public class Institute {

	private String name;
	private String address;
	private List<ResearchAssociate> employees;

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

	public String getAddress() {
		return this.address;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public List<ResearchAssociate> getEmployees() {
		return employees;
	}

	/**
	 * 
	 * @param employees
	 */
	public void setEmployees(List<ResearchAssociate> employees) {
		this.employees = employees;
	}

	/**
	 * 
	 * @param employee
	 */
	public void hire(ResearchAssociate employee) {
		employees.add(employee);
	}

	/**
	 * 
	 * @param employee
	 */
	public void fire(ResearchAssociate employee) {
		this.employees.remove(employee);
	}

	/**
	 * 
	 * @param name
	 * @param address
	 */
	public Institute(String name, String address) {
		this.name = name;
		this.address = address;
	}

}
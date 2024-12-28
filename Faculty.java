import java.util.List;

public class Faculty {

	private String name;
	private List<Institute> institutes;

	public Faculty(String name) {
		this.name = name;
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

	public List<Institute> getInstitutes() {
		return institutes;
	}

	/**
	 * 
	 * @param institutes
	 */
	public void setInstitutes(List<Institute> institutes) {
		this.institutes = institutes;
	}

	/**
	 * 
	 * @param institute
	 */
	public void addInstitute(Institute institute) {
		this.institutes.add(institute);
	}

	/**
	 * 
	 * @param institute
	 */
	public void removeInstitute(Institute institute) {
		institutes.remove(institute);
	}
}
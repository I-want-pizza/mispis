import java.util.ArrayList;
import java.util.List;

public class ResearchAssociate extends Employee {
	protected String fieldOfStudy;
	protected List<Project> projects;

	public String getFieldOfStudy() {
		return this.fieldOfStudy;
	}

	/**
	 * 
	 * @param fieldOfStudy
	 */
	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	public List<Project> getProjects() {
		return projects;
	}

	/**
	 * 
	 * @param projects
	 */
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	/**
	 * 
	 * @param project
	 */
	public void startProject(Project project) {
		this.projects.add(project);
	}

	/**
	 * 
	 * @param project
	 */
	public void finishProject(Project project) {
		this.projects.remove(project);
	}

	/**
	 * 
	 * @param ssNo
	 * @param name
	 * @param fieldOfStudy
	 */
	public ResearchAssociate(int ssNo, String name, String fieldOfStudy, String email) {
        super(email, name, ssNo);
		this.fieldOfStudy = fieldOfStudy;
		this.projects = new ArrayList<>();
    }

}
import java.util.List;

public class Lecturer extends ResearchAssociate {

	private List<Course> courses;

	public List<Course> getCourses() {
		return courses;
	}

	/**
	 * 
	 * @param courses
	 */
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	/**
	 * 
	 * @param course
	 */
	public void addCourse(Course course) {
		this.courses.add(course);
	}

	/**
	 * 
	 * @param course
	 */
	public void removeCourse(Course course) {
		this.courses.remove(course);
	}

	/**
	 * 
	 * @param ssNo
	 * @param name
	 * @param fieldOfStudy
	 */
	public Lecturer(int ssNo, String name, String fieldOfStudy, String email, List<Course> courses) {
		super(ssNo, name, fieldOfStudy, email);
		this.courses = courses;
	}

}
package javaCourse03.model;

public class Instructor extends User {

	private String instructorNumber;
	private String courseName;
	
	public Instructor(int id, String firstName, String lastName, String email, String instructorNumber,
			String courseName) {
		super(id, firstName, lastName, email);
		this.instructorNumber = instructorNumber;
		this.courseName = courseName;
	}

	public String getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	
}

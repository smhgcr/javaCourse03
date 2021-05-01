package javaCourse03.manager;

import javaCourse03.model.Instructor;

public class InstructorManager extends UserManager {

	public void showCourse(Instructor instructor) {

		System.out.println(instructor.getFirstName() + " " + instructor.getCourseName() + " dersini vermektedir.");
	}

}

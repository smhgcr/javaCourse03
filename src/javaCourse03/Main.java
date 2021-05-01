package javaCourse03;

import javaCourse03.manager.InstructorManager;
import javaCourse03.manager.UserManager;
import javaCourse03.model.Instructor;
import javaCourse03.model.Student;
import javaCourse03.model.User;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "Semih", "Gecer", "smhgcr@hotmail.com", "1907001");
		Student student2 = new Student(2, "Kadir", "Yilmaz", "kadiryilmaz@hotmail.com", "1907002");
		Student student3 = new Student(3, "Emir", "Yilmaz", "emiryilmaz@hotmail.com", "1907003");

		Instructor instructor1 = new Instructor(1, "Mehmet", "Alan", "mehmetalan@hotmail.com", "54001", "Java");
		Instructor instructor2 = new Instructor(1, "Fatih", "Sever", "fatihsever@hotmail.com", "54002", "Mssql");

		User[] userList = { student1, student2, instructor1, instructor2 };

		UserManager userManager = new UserManager();

		userManager.showAllUser(userList);

		System.out.println("************************************");

		userManager.add(student3);

		System.out.println("************************************");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.showCourse(instructor1);
		instructorManager.showCourse(instructor2);

		System.out.println("************************************"); 
		
		userManager.delete(instructor2);

	}

}

package Asign2.Asgn2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Controller.TeacherController;
import Model.Entity.Teacher;
import Model.Service.TeacherService;

@SpringBootApplication
public class Asgn2Application{
	
	
	public static void main(String[] args) {
		
		
		SpringApplication.run(Asgn2Application.class, args);
	//	TeacherController teacherController = new TeacherController();
		Teacher teacher1 = new Teacher();
		//teacher1.setCourses(null);
		teacher1.setEmail("dan@yahoo.com");
		teacher1.setFirstName("Dan");
		teacher1.setLastName("Darie");
		//teacher1 = teacherController.create(teacher1);
		
		TeacherService teacherController = new TeacherService();
		Teacher teacher11 = new Teacher();
		teacher11.setCourses(null);
		teacher11.setEmail("dan@yahoo.com");
		teacher11.setFirstName("Dan");
		teacher11.setLastName("Darie");
		teacher11 = teacherController.create(teacher11);
	}

}

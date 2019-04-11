package View;

import org.junit.Test;

import Model.Entity.Teacher;
import Model.Service.TeacherService;

public class Tester {

	@Test
	public void test() {
	
		Teacher teacher1 = new Teacher();
		teacher1.setCourses(null);
		teacher1.setEmail("dan@yahoo.com");
		teacher1.setFirstName("Dan");
		teacher1.setLastName("Darie");
		
		TeacherService teacherService = new TeacherService();
		teacher1 = teacherService.create(teacher1);
		//System.out.println(teacherService.getAllTeachersWithCourses());
	}

}

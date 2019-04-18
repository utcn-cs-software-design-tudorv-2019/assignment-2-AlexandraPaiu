package Model.Service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import Model.Entity.Teacher;
import Model.Repository.TeacherRepository;

@Service()
public class TeacherService {

	@Inject
	TeacherRepository teacherRepository ;
	
	public List<Teacher> getAllTeachersWithCourses(){
		return teacherRepository.findAll();
	}
	
	public Teacher create(Teacher newTeacher){
		return teacherRepository.save(newTeacher);
	
	}
	
	public void delete(Teacher oldTeacher) {
		 teacherRepository.delete(oldTeacher);
	}
	
	public void deleteById(int  idTeacher) {
		 teacherRepository.deleteById(idTeacher);
	}
}

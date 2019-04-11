package Model.Service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import Model.Entity.Student;
import Model.Repository.StudentRepository;


@Service
public class StudentService {

	@Inject
	StudentRepository studentRepository;
	
	public List<Student> getAllStudentswithEnrollments(){
		return studentRepository.findAll();
	}
	
	public Student create(Student newStudent){
		return studentRepository.save(newStudent);
	}
	
	public void delete(Student oldStudent) {
		studentRepository.delete(oldStudent);
	}
	
	public void deleteById(int  idStudent) {
		studentRepository.deleteById(idStudent);
	}
}

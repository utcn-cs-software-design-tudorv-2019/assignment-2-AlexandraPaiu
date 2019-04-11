package Model.Service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import Model.Entity.Enrollment;
import Model.Repository.EnrollmentRepository;


@Service
public class EnrollmentService {

	@Inject
	EnrollmentRepository enrollmentRepository;
	
	
	public List<Enrollment> getAllEnrollments(){
		return enrollmentRepository.findAll();
	}

	public List<Enrollment> getAllCourses(){
		return enrollmentRepository.findAll();
	}
	
	public List<Enrollment> getAllEnrollmentsByStudentFirstName(String firstName){
		List<Enrollment> enrollmentFilteredList = null;
		
		if (StringUtils.isEmpty(firstName)){
			enrollmentFilteredList = enrollmentRepository.findAll();
		}
		else{
			enrollmentFilteredList = enrollmentRepository.findAllByStudentFirstName(firstName);
		}
		return enrollmentFilteredList;
	}	
	
	public List<Enrollment> getAllEnrollmentsByCourseName(String courseName){
		List<Enrollment> enrollmentFilteredList = null;
		
		if (StringUtils.isEmpty(courseName)){
			enrollmentFilteredList = enrollmentRepository.findAll();
		}
		else{
			enrollmentFilteredList = enrollmentRepository.findAllByCourseName(courseName);
		}
		return enrollmentFilteredList;
	}
	
	public Enrollment create(Enrollment newEnrollment){
		return enrollmentRepository.save(newEnrollment);
	}	

	public void deleteById(int  idEnrollment) {
		enrollmentRepository.deleteById(idEnrollment);
	}
}

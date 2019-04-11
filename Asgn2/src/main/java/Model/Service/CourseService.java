package Model.Service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import Model.Entity.Course;
import Model.Repository.CourseRepository;

@Service
public class CourseService {

	@Inject
	CourseRepository courseRepository;
	
	public List<Course> getAllCourses(){
		return courseRepository.findAll();
	}
	
	public List<Course> getAllCoursesByTeacherFirstName(String firstName){
		List<Course> coursesFilteredList = null;
		
		if (StringUtils.isEmpty(firstName)){
			coursesFilteredList = courseRepository.findAll();
		}
		else{
			coursesFilteredList = courseRepository.findAllByTeacherFirstName(firstName);
		}
		return coursesFilteredList;
	}
	
	public Course create(Course newCourse){
		return courseRepository.save(newCourse);
	}
	
	public void delete(Course oldCourse) {
		courseRepository.delete(oldCourse);
	}
	
	public void deleteById(int idCourse) {
		courseRepository.deleteById(idCourse);
	}
}

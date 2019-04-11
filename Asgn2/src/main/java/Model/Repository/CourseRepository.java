package Model.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.Entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>   {

	List<Course> findAllByTeacherFirstName(String firstName);

}

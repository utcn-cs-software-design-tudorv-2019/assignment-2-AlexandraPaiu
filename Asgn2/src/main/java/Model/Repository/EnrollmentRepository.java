package Model.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.Entity.Enrollment;

public  interface EnrollmentRepository extends JpaRepository<Enrollment, Integer>  {

	List<Enrollment> findAllByStudentFirstName(String firstName);

	List<Enrollment> findAllByCourseName(String courseName);

}

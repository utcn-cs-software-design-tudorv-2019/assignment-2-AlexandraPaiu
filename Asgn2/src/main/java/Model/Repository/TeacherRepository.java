package Model.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.Entity.Teacher;


public  interface TeacherRepository extends JpaRepository<Teacher, Integer> {

	@SuppressWarnings("unchecked")
	public Teacher save(Teacher teacher);
	
	public List<Teacher> findAll();

	public void delete(Teacher teacher);
}

package Model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.Entity.Teacher;

public  interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}

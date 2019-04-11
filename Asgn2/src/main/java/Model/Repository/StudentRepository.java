package Model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.Entity.Student;

public  interface StudentRepository extends JpaRepository<Student, Integer>  {

}

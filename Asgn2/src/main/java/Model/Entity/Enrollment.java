package Model.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "enrollment")
public class Enrollment {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEnrollment;
		
	@Column
	private String firstName;
	
	@Column
	private String exam;

	@ManyToOne
	@JoinColumn(name = "course")
	@NonNull
	private Course course;
	
	@ManyToOne
	@JoinColumn(name = "student")
	@NonNull
	private Student student;
	
	public Integer getIdEnrollment() {
		return idEnrollment;
	}

	public void setIdEnrollment(Integer idEnrollment) {
		this.idEnrollment = idEnrollment;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getExam() {
		return exam;
	}

	public void setExam(String exam) {
		this.exam = exam;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}

package Model.Entity;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher {

	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTeacher;
		
	@Column
	private String firstName;
		
	@Column
	private String lastName;
		
	@Column
	private String email;

	
	 @OneToMany(mappedBy = "teacher", fetch = FetchType.EAGER)
	 private List<Course> courses;
	
	public Integer getIdTeacher() {
		return idTeacher;
	}

	public void setIdTeacher(Integer idTeacher) {
		this.idTeacher = idTeacher;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
		
}

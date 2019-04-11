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
@Table(name = "student")
public class Student {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idStudent;
		
	@Column
	private String firstName;
		
	@Column
	private String lastName;
		
	@Column
	private String email;
	
	@Column
	private String group;
	
	@OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
	private List<Enrollment> enrollment;
	
	public Integer getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(Integer idStudent) {
		this.idStudent = idStudent;
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

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public List<Enrollment> getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(List<Enrollment> enrollment) {
		this.enrollment = enrollment;
	}
	
	
}

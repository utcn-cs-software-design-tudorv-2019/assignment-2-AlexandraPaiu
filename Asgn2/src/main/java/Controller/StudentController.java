package Controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;

import Model.Repository.StudentRepository;

@Controller
public class StudentController {

	@Inject
	StudentRepository studentRepository;
}

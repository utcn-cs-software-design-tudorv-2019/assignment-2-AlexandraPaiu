package Controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;

import Model.Repository.EnrollmentRepository;

@Controller
public class EnrollmentController {

	@Inject
	EnrollmentRepository enrollmentRepository; 
}

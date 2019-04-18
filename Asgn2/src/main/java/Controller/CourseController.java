package Controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;

import Model.Repository.CourseRepository;

@Controller
public class CourseController {

	@Inject
	CourseRepository courseRepository;
}

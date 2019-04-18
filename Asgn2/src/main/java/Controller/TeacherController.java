package Controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;

import Model.Service.TeacherService;

@Controller
public class TeacherController {

	@Inject
	TeacherService teacherService;

}

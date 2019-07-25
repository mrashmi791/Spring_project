import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@RequestMapping("/")
	public ModelAndView home() {
		
		@Autowired
		private StudentService service;
		
		ModelAndView view = new ModelAndView("index");
		
		List<Student> listStudent = service.listAll();
		view.addObject("listStudent" , "listStudent");
		return view;
		
	}
	
	@RequestMapping("/new")
	public String newStudentForm(Map<String , object> model) {
		model.put("student", new Student);
		return new_student;
	}
	
	
}

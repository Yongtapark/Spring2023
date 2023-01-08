package asd;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/google")
public class googleController {
	
	@RequestMapping("/student")
	public void student(Model model) {
		model.addAttribute("student","we will student..");
	}
	
	@RequestMapping("/teacher")
	public void teacher(Model model) {
		model.addAttribute("teacher","we will teacher..");
	}
	
	@RequestMapping("/meetAdress")
	public void meetAdress(Model model) {
		model.addAttribute("meetAdress","we will meetAdress..");
	}
}

package com.lab.lab;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/go")
public class CheckController {
	
	@RequestMapping("/op")
	public void open(Model model) {
		model.addAttribute("msg","값을 표기합니다.");
	}
}

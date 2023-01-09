package com.sample.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cons")
public class labControll {
	@RequestMapping("/troll")
	public void trol(Model model) {
		model.addAttribute("go","안녕하세요");
	}
}

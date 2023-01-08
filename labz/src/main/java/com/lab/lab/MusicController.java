package com.lab.lab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/music")
public class MusicController {
	
	@RequestMapping("/rock")
	public void rock(Model model) {
		model.addAttribute("msg","we will rock..");
	}
}

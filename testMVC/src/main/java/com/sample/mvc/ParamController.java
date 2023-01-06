package com.sample.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller// :해당 클래스의 인스턴스를 스프링 빈으로 등록하고 컨트롤러로 사용 <component-scan>과 같이 사용
@RequestMapping("/param") //특정한 URI에 대한 처리를 해당 컨트롤러나 메서드에서 처리
public class ParamController{//pram/input 요청하면
	@RequestMapping(value="input",method=RequestMethod.GET)//스프링 4.3이상 GetMapping()으로 대체 @GetMapping("/input")
	public String input() {
		return "input";//views/input.jsp get 방식으로 찾아감
	}
	
	@RequestMapping(value="input", method=RequestMethod.POST)//스프링4.3 이상 PostMapping()으로 대체 @PostMapping("/input)
	public String inputAction(String name, Model model) {
		model.addAttribute("msg", name+",your friend...");
		
		return "inputAction"; //views/inputAction.jsp post 방식으로 찾아감
	}
	// param/hi 요청하면
	@RequestMapping(value = "hi", method = RequestMethod.GET,produces = "text/html; charset=utf-8")
	@ResponseBody //아래 내용을 브라우저 창에 출력
	public String hi() {
		return "<h1 style='color:red'>개같은 코딩</h1>"+
				"<h2>개같은 자바 개같은 html<h2>";
	}
	
	
}

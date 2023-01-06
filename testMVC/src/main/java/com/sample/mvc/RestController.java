package com.sample.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
// http://localhost:80893/mvc/rest/1
@Controller
@RequestMapping("/rest")
public class RestController {
	// /rest1 --> 요청하면  int no에 값이 들어감
	// 그래서 같은 변수명이어야 함. {no}=int no
	@RequestMapping("/{no}") // /rest/1 이렇게 접근해야함
	public String rest(@PathVariable int no ,Model model) {	
		model.addAttribute("msg",no+"페이지 출력");
		
		return "/rest/rest";//views/rest/rest.jsp
		
	}
	
	@RequestMapping("/{no}/{action}") // /rest/1 이렇게 접근해야함
	public String rest(@PathVariable int no ,@PathVariable String action, Model model) {	
		String msg=null;
		
		if(action.equals("i")||action.equals("put")) {
			msg=no+"번 게시물을 입력합니다."+action;
		}else if(action.equals("s")||action.equals("get")) {
			msg=no+"번 게시물을 조회합니다."+action; 
		}else if(action.equals("d")||action.equals("delete")) {
			msg=no+"번 게시물을 삭제합니다."+action; 
		}else if(action.equals("u")){
			msg=no+"번 게시물을 수정합니다."+action; 
		}else {
			msg="액션 지정 error..."+action;
		}
		
		model.addAttribute("msg",msg);
		
		return "/rest/rest";//views/rest/rest.jsp
	}
	
	@RequestMapping(value="/action",method=RequestMethod.GET)
	public void get1(Model model) {
		model.addAttribute("action","action...");
		System.out.println("Get 방식입니다.");
	}
	}
	/*
	 * Controller의 리턴타입
	 * -String 타입 : jsp, json, http의 body 내용일 때 사용
	 * 	.redirect:리다이렉트 방식으로 처리하는 경우, response.sendRedirect(),HttpSession에 일회만 기록됨
	 * 	.forward : 포워드 방식으로 처리하는 경우, request.forward();
	 * -void 타입 : 호출하는 URL(uri)와 동일한 이름의 jsp타입
	 * -VO,DTO 타입 : 주로 JSON타입의 데이터를 만들어서 반환하는 용도로 사용(추가 라이브러리 필요)
	 * -ResponseEntity : response 할때 Http 헤더 정보와 내용을 가공하는 용도로 사용 (추가 라이브러리 필요)
	 * -Model, ModelAndView 타입 : model로 데이터(결과값)를 반환하거나 화면까지 같이 지정하는 경우에 사용
	 * (최근에는 많이 사용하지 않음)
	 * -httpHeaders : 응당에 내용 없이 Http 헤더 메세지만 전달하는 용도로 사용.
	 * */



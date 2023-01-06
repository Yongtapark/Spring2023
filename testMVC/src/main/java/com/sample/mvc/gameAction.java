package com.sample.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class gameAction extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String youNum=request.getParameter("you");
		String comNum=(int)(Math.random()*3+1)+" ";
		
		ModelAndView mv=new ModelAndView();
		if((youNum.equals("1")&&comNum.equals("2")) ||
		   (youNum.equals("2")&&comNum.equals("3")) ||
		   (youNum.equals("3")&&comNum.equals("1"))) {
			mv.addObject("msg","Your ar lost....");
		}else if(youNum.equals(comNum)) {
			mv.addObject("msg" , "draw...");
		}else {
			mv.addObject("msg" , "Your are win...");
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>youNum : "+youNum+",comNum :"+comNum);
		mv.setViewName("gameresult");//view/gmaeresult.jsp를 찾음.
		
		return mv; //gameresult.jsp가서 msg 출력
	}

	

}

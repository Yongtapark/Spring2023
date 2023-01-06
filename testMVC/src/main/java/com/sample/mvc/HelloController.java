package com.sample.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView mv =new ModelAndView();
		mv.setViewName("hellocontroll");//��� hellocontroll.jsp
		//vew/hellocontroll.jsp�� �����Ͽ� msg�� ��� --> ${msg}
		mv.addObject("msg","hello spring MVC...");//�Ӽ���, �Ӽ���
		
		return mv;
	}

}

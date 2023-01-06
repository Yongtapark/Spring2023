package com.sample.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class Process extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String name=request.getParameter("name");
		String greeting="안녕하세요"+name+"씨";
		//view명, 모델명, 모델의 값
		return new ModelAndView("process","greeting",greeting);
	}

}

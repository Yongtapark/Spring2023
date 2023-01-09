package com.sample.mvc.jdbc;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class EmpListAction extends AbstractController{
	public static final Logger logger=LoggerFactory.getLogger(EmpListAction.class);
	private EmpDAO empDAO;
	
	
	
	public void setEmpDAO(EmpDAO empDAO) {
		this.empDAO = empDAO;
	}



	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<EmpVO> empList=empDAO.getDeptList();
		
		ModelAndView mav=new ModelAndView();
		
		mav.setViewName("empList");//empList.jsp
		mav.addObject("empList",empList);
		mav.addObject("totalSal",empDAO.getTotalSal());
		
	
		return mav;
	}

}

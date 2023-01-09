package com.sample.mvc.jdbc;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class EmpUpdate extends AbstractController{
	public static final Logger logger= 
			LoggerFactory.getLogger(EmpUpdate.class);
	
	private EmpDAO empDAO;
	
	public void setEmpDAO(EmpDAO empDAO) {
		this.empDAO = empDAO;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int empno=Integer.parseInt(request.getParameter("empno"));
		String ename=request.getParameter("ename");
		
		EmpVO empVO=empDAO.getEmp(empno);
		List<DeptVO> deptList=empDAO.getDeptList();
		
		for(DeptVO d: deptList) {
			logger.info(d.toString());
		}
		logger.info(empVO.toString());
		ModelAndView mav=new ModelAndView();
		mav.setViewName("empUpdate");
		mav.addObject("deptList",deptList);
		mav.addObject("empVO",empVO);
		return mav;
	}
	@RequestMapping("empUpdate")
	public void empInsert(EmpVO emp) {
		logger.info(emp.toString());
	}

}

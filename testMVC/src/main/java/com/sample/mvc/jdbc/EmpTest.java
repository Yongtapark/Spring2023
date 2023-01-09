package com.sample.mvc.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {
	
	public static void main(String[]args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("com/sample/mvc/jdbc/emp.xml");
		
		EmpController empController=app.getBean("empController",EmpController.class);
		empController.getEmpList();
	}
}

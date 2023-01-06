package test9;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import test8.AdminCnn;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ann=new AnnotationConfigApplicationContext(applicationConfig.class);
		AdminCnn admin=ann.getBean("adminconfig",AdminCnn.class);
		
		System.out.println(admin.getAdminId());
		System.out.println(admin.getAdminPw());
		System.out.println("--------------");
		System.out.println(admin.getSubId());
		System.out.println(admin.getSubPw());
		ann.close();

	}

}

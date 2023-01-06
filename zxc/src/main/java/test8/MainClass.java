package test8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[]args) {
		AbstractApplicationContext abs= new GenericXmlApplicationContext("test8/applicationContext8.xml");
		
		AdminCnn admin =abs.getBean("adminCnn",AdminCnn.class);
		
		System.out.println(admin.getAdminId());
		System.out.println(admin.getAdminPw());
		System.out.println("------------------");
		System.out.println(admin.getSubId());
		System.out.println(admin.getSubPw());
	}
}

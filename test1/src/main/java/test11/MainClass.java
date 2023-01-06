package test11;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[]args) {
		String config= null;
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		if(str.equals("test")) {
			config="test";
		}
		if(str.equals("run")) {
			config="run";
		}
		sc.close();
		GenericXmlApplicationContext ann= new GenericXmlApplicationContext();
		ann.getEnvironment().setActiveProfiles(config);
		
		ann.load("test11/application11_run.xml");
		ann.load("test11/application11_test.xml");
		SerInfo info =ann.getBean("serInfo",SerInfo.class);
		
		System.out.println("ip : "+info.getIpNum());
		System.out.println("port : "+info.getPortNum());
		
		ann.close();
		
	}
}

package test10;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String config=null;
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();
		if(str.equals("run")) {
			config="run";
		}else if(str.equals("test")) {
			config="test";
		}
		
		
		AnnotationConfigApplicationContext ann = new AnnotationConfigApplicationContext();
		
		ann.getEnvironment().setActiveProfiles(scanner.next());
		
		ann.register(AppConfigRun.class,AppConfigTest.class);
		
		ann.refresh();
		
		SerInfo info=ann.getBean("serverinfo",SerInfo.class);
		
		System.out.println(info.getIpNum());
		System.out.println(info.getPortNum());
		scanner.close();
		ann.close();
		

	}

}

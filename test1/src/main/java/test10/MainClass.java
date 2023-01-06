package test10;

import java.lang.annotation.Annotation;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[]args) {
		String config=null;
		Scanner scanner=new Scanner(System.in);
		
		String str=scanner.next();
		if(str.equals("run")) {
			config="run";
		}else if(str.equals("test")) {
			config="test";
		}
		scanner.close();
		
		//@ȯ�� �о�ͼ� ��ü �����ϱ�
		AnnotationConfigApplicationContext ann=new AnnotationConfigApplicationContext();
		
		//ȯ�������� getEnvironment() �������� �޼ҵ�
		//������ ������ config���� ������ ��.
		ann.getEnvironment().setActiveProfiles(config);
		//��� // Ŭ������� ȯ������
		ann.register(AppConfigRun.class,AppConfigTest.class);
		
		ann.refresh();//���� ��
		
		SerInfo info=ann.getBean("serverinfo",SerInfo.class);
		
		System.out.println("ip�ּ� : "+info.getIpNum());
		System.out.println("��Ʈ��ȣ : "+info.getPortNum());
		
		ann.close();
	}
}

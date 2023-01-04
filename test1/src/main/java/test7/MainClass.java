package test7;

import java.io.IOException;
import java.lang.annotation.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test5.Student;

public class MainClass {

	public static void main(String[] args) {
		googlecheck_Simple go =new googlecheck_Simple();
		//go.check();
		System.out.println(go.resultCamoff);
		
	
	//객체 생성
		AnnotationConfigApplicationContext ann=new AnnotationConfigApplicationContext(applicationconfig1.class);//자바환경설정 파일
	test7.Student student1=ann.getBean("student1",test7.Student.class);
	System.out.println("이름 : "+student1.getName());
	System.out.println("나이 : "+student1.getAge());
	System.out.println("취미 : "+student1.getHobby());
	System.out.println("키 : "+student1.getHeight());
	System.out.println("무게 : "+student1.getWeight());
	
	System.out.println("--------------------------------------------------");

	test7.Student student2=ann.getBean("student2",test7.Student.class);
	System.out.println("이름 : "+student2.getName());
	System.out.println("나이 : "+student2.getAge());
	System.out.println("취미 : "+student2.getHobby());
	System.out.println("키 : "+student2.getHeight());
	System.out.println("무게 : "+student2.getWeight());
	

	
	}
	
}

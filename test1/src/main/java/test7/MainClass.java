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
		
	
	//��ü ����
		AnnotationConfigApplicationContext ann=new AnnotationConfigApplicationContext(applicationconfig1.class);//�ڹ�ȯ�漳�� ����
	test7.Student student1=ann.getBean("student1",test7.Student.class);
	System.out.println("�̸� : "+student1.getName());
	System.out.println("���� : "+student1.getAge());
	System.out.println("��� : "+student1.getHobby());
	System.out.println("Ű : "+student1.getHeight());
	System.out.println("���� : "+student1.getWeight());
	
	System.out.println("--------------------------------------------------");

	test7.Student student2=ann.getBean("student2",test7.Student.class);
	System.out.println("�̸� : "+student2.getName());
	System.out.println("���� : "+student2.getAge());
	System.out.println("��� : "+student2.getHobby());
	System.out.println("Ű : "+student2.getHeight());
	System.out.println("���� : "+student2.getWeight());
	

	
	}
	
}

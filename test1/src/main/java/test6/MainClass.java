package test6;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext abs = new ClassPathXmlApplicationContext("classpath:test6/applicationContext6.xml");

		Student student1 = abs.getBean("student1", Student.class);

		System.out.println("�̸� :" + student1.getName());
		System.out.println("���� :" + student1.getAge());
		System.out.println("��� :" + student1.getHobby());
		System.out.println("Ű :" + student1.getHeight());
		System.out.println("������ :" + student1.getWeight());

		System.out.println("------------------------------------");

		Student student2 = abs.getBean("student2", Student.class);

		System.out.println("�̸� :" + student2.getName());
		System.out.println("���� :" + student2.getAge());
		System.out.println("��� :" + student2.getHobby());
		System.out.println("Ű :" + student2.getHeight());
		System.out.println("������ :" + student2.getWeight());

	}

}

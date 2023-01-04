package test7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ann=
				new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Student student1=ann.getBean("student1",Student.class);
		System.out.println("�̸� : "+student1.getName());
		System.out.println("���� : "+student1.getAge());
		System.out.println("��� : "+student1.getHobby());
		System.out.println("Ű : "+student1.getHeight());
		System.out.println("���� : "+student1.getWeight());

		
		Student student2=ann.getBean("student2",Student.class);
		System.out.println("�̸� : "+student2.getName());
		System.out.println("���� : "+student2.getAge());
		System.out.println("��� : "+student2.getHobby());
		System.out.println("Ű : "+student2.getHeight());
		System.out.println("���� : "+student2.getWeight());
	}

}

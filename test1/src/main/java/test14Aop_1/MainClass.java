package test14Aop_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext app=new GenericXmlApplicationContext("test14Aop_1/application14_1.xml");
		
		Student stu=app.getBean("student", Student.class);
		stu.getStudentInfo();
		
		work worker=app.getBean("worker",work.class);
		worker.getJobInfo();
		app.close();
				
	}

}

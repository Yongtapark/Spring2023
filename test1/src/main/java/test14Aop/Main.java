package test14Aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import sun.tools.jconsole.Worker;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext app = new
				GenericXmlApplicationContext("test14Aop/application14.xml");
		
		Student stu=app.getBean("student",Student.class);
		stu.getStudentInfo();
		
		work worker=app.getBean("worker",work.class);
		worker.getworkerInfo();
		app.close();
		
		

	}

}

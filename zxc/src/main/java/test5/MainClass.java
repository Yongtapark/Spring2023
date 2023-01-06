package test5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[]args) {
		
		AbstractApplicationContext abs=new GenericXmlApplicationContext("test5/apllicationContext5.xml");
		
		StudentInfo studentinfo=abs.getBean("studentInfo",StudentInfo.class);
		
		studentinfo.getStudentInfo();
		
		Student stu=abs.getBean("student2",Student.class);
		
		studentinfo.setStudent(stu);
		studentinfo.getStudentInfo();
		
		abs.close();
		
	}
}

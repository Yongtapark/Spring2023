package test5;
//1. xml ¼³Á¤
import org.springframework.context.event.AbstractApplicationEventMulticaster;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[]args) {
		AbstractApplicationContext abs=new GenericXmlApplicationContext("test5/applicationContext5.xml");
		
		
		StudentInfo studentinfo=abs.getBean("studentInfo",StudentInfo.class);
		studentinfo.getStudentInfo();
		
		StudentInfo studentinfo2=abs.getBean("studentInfo2",StudentInfo.class);
		studentinfo2.getStudentInfo();
		
		
		Student stu=abs.getBean("student2",Student.class);
		
		studentinfo.setStudent(stu);
		studentinfo.getStudentInfo();
		
		abs.close();
		
	}
}

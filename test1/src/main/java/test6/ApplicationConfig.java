package test6;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//자바를 환경설정파일로 만들어서 xml 환경설정파일에 포함하여 main에서 호출

@Configuration // 환경설정파일로 정의
public class ApplicationConfig {
	
	@Bean // 'student1'로 객체 생성하라는 의미 
	public Student student1() {
		ArrayList<String> hobbys=new ArrayList<String>();
		
		hobbys.add("공부하기");
		hobbys.add("놀기");
		Student student =new Student("농땡이",20,hobbys);
		student.setHeight(190);
		student.setWeight(90);
		
		return student;
	}
}



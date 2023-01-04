package test7;
//java 파일에 xml 환경설정파일을 가지고와서 main에서 자바환경설정 파일을 검색하도록 해보자
import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration//환경설정 파일
@ImportResource("test7/applicatiationContext7.xml")//xml 파일 가져옴
public class applicationconfig1 {
	@Bean
	public Student student1 () {
		ArrayList<String> hobbys=new ArrayList<String>();
		
		hobbys.add("공부하기");
		hobbys.add("먹고놀기");
		Student student=new Student("동댕이", 20, hobbys);
		student.setHeight(167);
		student.setWeight(73);
		
		return student;
		
	}
	
	
}

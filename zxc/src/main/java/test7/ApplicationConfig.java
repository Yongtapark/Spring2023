package test7;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("test7/applicationContext7.xml")
public class ApplicationConfig {
	@Bean
	public Student student1() {
		ArrayList<String> hobbys=new ArrayList<String>();
		hobbys.add("¸Ô°í ³î±â");
		hobbys.add("ÀáÀÚ±â");
		
		Student student=new Student("¹é¼ö", 20, hobbys);
		student.setHeight(180);
		student.setWeight(60);
		return student;
	}
}

package test6;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//�ڹٸ� ȯ�漳�����Ϸ� ���� xml ȯ�漳�����Ͽ� �����Ͽ� main���� ȣ��

@Configuration // ȯ�漳�����Ϸ� ����
public class ApplicationConfig {
	
	@Bean // 'student1'�� ��ü �����϶�� �ǹ� 
	public Student student1() {
		ArrayList<String> hobbys=new ArrayList<String>();
		
		hobbys.add("�����ϱ�");
		hobbys.add("���");
		Student student =new Student("����",20,hobbys);
		student.setHeight(190);
		student.setWeight(90);
		
		return student;
	}
}



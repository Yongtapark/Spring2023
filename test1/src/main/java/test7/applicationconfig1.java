package test7;
//java ���Ͽ� xml ȯ�漳�������� ������ͼ� main���� �ڹ�ȯ�漳�� ������ �˻��ϵ��� �غ���
import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration//ȯ�漳�� ����
@ImportResource("test7/applicatiationContext7.xml")//xml ���� ������
public class applicationconfig1 {
	@Bean
	public Student student1 () {
		ArrayList<String> hobbys=new ArrayList<String>();
		
		hobbys.add("�����ϱ�");
		hobbys.add("�԰���");
		Student student=new Student("������", 20, hobbys);
		student.setHeight(167);
		student.setWeight(73);
		
		return student;
		
	}
	
	
}

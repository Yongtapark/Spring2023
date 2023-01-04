package test3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class MainApp {

	public static void main(String[] args) {
		//���� ���Ŀ� �����ϰ� �о�ͼ� ��ü�� ����� ���´�.
		Resource resource=new FileSystemResource("src/main/java/test3/applicationContext3.xml");
		//�����
		@SuppressWarnings("deprecation")
		BeanFactory factory=new XmlBeanFactory(resource);
		HelloBean helloBean=factory.getBean("helloBean",HelloBean.class);
		
		System.out.println("helloBean-->"+helloBean.hashCode());
		
		//���
		helloBean.printHello("�ȳ�ȳ�!");

		System.out.println("----------------------girl-----------------------");
		HelloBean hello3=factory.getBean("hello",HelloBean.class);
		
		hello3.printHello("�ݰ���!");
	}

}

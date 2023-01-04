package test3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class MainApp {

	public static void main(String[] args) {
		//파일 형식에 무관하게 읽어와서 객체를 만들어 놓는다.
		Resource resource=new FileSystemResource("src/main/java/test3/applicationContext3.xml");
		//빈생성
		@SuppressWarnings("deprecation")
		BeanFactory factory=new XmlBeanFactory(resource);
		HelloBean helloBean=factory.getBean("helloBean",HelloBean.class);
		
		System.out.println("helloBean-->"+helloBean.hashCode());
		
		//사용
		helloBean.printHello("안녕안녕!");

		System.out.println("----------------------girl-----------------------");
		HelloBean hello3=factory.getBean("hello",HelloBean.class);
		
		hello3.printHello("반갑다!");
	}

}

package test4_1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class MainApp {

	public static void main(String[] args) {
		Resource resource=new FileSystemResource("src/main/java/test4_1/applicationContext4_1.xml");
		
		BeanFactory factory =new XmlBeanFactory(resource);
		HelloBean hellobean = factory.getBean("helloBean",HelloBean.class);
		
		hellobean.printHello("");
	}

}

package test15Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[]args) {
		String[] configs= {"test15Aop/applicationContext15.xml"};
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext(configs);
		HelloBean bean=(HelloBean)factory.getBean("beanProxy");
		//HelloBean bean = factory.getBean("targetBean",HelloBean.class);
		bean.printHello("Spring...;;");
		//BeanFactory ´Â autoProxy°¡ ¾ÈµÊ
		
	}
}

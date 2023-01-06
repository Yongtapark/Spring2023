package test15Aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


//Aspect Ŭ���� = ����Ŭ����
public class LogingTest implements MethodInterceptor {
	                      //joinpoint
	public Object invoke(MethodInvocation invocation)throws Throwable{
		String methodName= invocation.getMethod().getName();
		
		System.out.println(methodName+"������");
		Object obj= invocation.proceed();//��� �޼ҵ� ȣ��
		System.out.println(methodName+"���� ��");
		return obj;
	}
}

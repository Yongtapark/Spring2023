package test14Aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogApp {
	@Pointcut("within(test14Aop.*)")
	public void pointcutMethod() {

	}

	@Around("pointcutMethod()")
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {

		String sing = joinpoint.getSignature().getName();

		System.out.println(sing + "����...");

		long st = System.currentTimeMillis();

		try {
			Object obj = joinpoint.proceed();// ��� �޼ҵ� ȣ��
			return obj;
		} finally {
			long et = System.currentTimeMillis();
			System.out.println(sing + " ��");
			System.out.println(sing + " ����ð� : " + (et - st));
		}

	}
	@Before("within(test14Aop.*)")
	public void beforeAdvice() {
		System.out.println("before...");
	}

}

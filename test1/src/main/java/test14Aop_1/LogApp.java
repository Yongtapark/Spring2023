package test14Aop_1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogApp {
	@Pointcut("within(test14Aop_1.*)")
	public void pointcutMethod() {
		
	}
	
	@Around("pointcutMethod()")
	public Object LoggerAop(ProceedingJoinPoint joinpoint)throws Throwable{
	String sing =joinpoint.getSignature().getName();
	System.out.println(sing+"시작...");
	
	long st= System.currentTimeMillis();
	
	try {
		Object obj=joinpoint.proceed();//대당 메소드 호출
		return obj;
	}finally {
		long et = System.currentTimeMillis();
		System.out.println(sing+" 끝");
		System.out.println(sing + " 경과시간 : "+(et-st));
		}
	}
	@Before("within(test14Aop_1.*)")
	public void beforeAdvice() {
		System.out.println("before...");
	}
	
}

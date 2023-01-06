package test12Aop;


import org.aspectj.lang.ProceedingJoinPoint;
//공통관심프로그램 =Aspect
public class profilingAdvice {
	//공통관심프로그램에서 실제 대상메소드에 끼워놓는 메소드
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable{
		//대상 메소드의 정보들
		String signatureString = joinPoint.getSignature().toShortString();
		System.out.println(signatureString +"시작");
		long start= System.currentTimeMillis();
		Object result =null;
			result=joinPoint.proceed();//대상 메소드 호출
			long finish=System.currentTimeMillis();
			System.out.println(signatureString+"종료");
			System.out.println(signatureString+"실행 시간 :" + (finish-start)+"ms");
		return result;
	}
}

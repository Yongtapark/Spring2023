package test12Aop;


import org.aspectj.lang.ProceedingJoinPoint;
//����������α׷� =Aspect
public class profilingAdvice {
	//����������α׷����� ���� ���޼ҵ忡 �������� �޼ҵ�
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable{
		//��� �޼ҵ��� ������
		String signatureString = joinPoint.getSignature().toShortString();
		System.out.println(signatureString +"����");
		long start= System.currentTimeMillis();
		Object result =null;
			result=joinPoint.proceed();//��� �޼ҵ� ȣ��
			long finish=System.currentTimeMillis();
			System.out.println(signatureString+"����");
			System.out.println(signatureString+"���� �ð� :" + (finish-start)+"ms");
		return result;
	}
}

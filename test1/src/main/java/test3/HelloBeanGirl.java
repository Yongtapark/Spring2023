package test3;

public class HelloBeanGirl implements HelloBean{
	String msg;
	String age;
	kid helloGirl;
	// �������� ���� ���Թޱ� ���� ����
	
	public HelloBeanGirl(String msg, String age, kid helloGirl) {
		
		this.msg = msg;
		this.age = age;
		this.helloGirl = helloGirl;
	}

	public void printHello(String name) {
		System.out.println(name+"�ҳ�.."+msg+"���� "+age);
		System.out.println("������ �ݰ��� " +helloGirl.name);
		
	}
}

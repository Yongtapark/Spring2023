package test3;

public class HelloBeanBoy implements HelloBean{
	String msg;
	int age;
	kid helloBoy;
	// �������� ���� ���Թޱ� ���� ����
	
	public HelloBeanBoy(String msg, int age, kid helloBoy) {
		super();
		this.msg = msg;
		this.age = age;
		this.helloBoy = helloBoy;
	}

	public void printHello(String name) {
		System.out.println(name+"�ҳ�.."+msg+"���"+age);
		System.out.println("����� �̸��� " +helloBoy.name);
		
	}
}

package test3;

public class HelloBeanBoy implements HelloBean{
	String msg;
	int age;
	kid helloBoy;
	// 스프링을 통해 주입받기 위해 선언
	
	public HelloBeanBoy(String msg, int age, kid helloBoy) {
		super();
		this.msg = msg;
		this.age = age;
		this.helloBoy = helloBoy;
	}

	public void printHello(String name) {
		System.out.println(name+"소년.."+msg+"몇살"+age);
		System.out.println("당신의 이름은 " +helloBoy.name);
		
	}
}

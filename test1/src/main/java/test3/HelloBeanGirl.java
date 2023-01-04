package test3;

public class HelloBeanGirl implements HelloBean{
	String msg;
	String age;
	kid helloGirl;
	// 스프링을 통해 주입받기 위해 선언
	
	public HelloBeanGirl(String msg, String age, kid helloGirl) {
		
		this.msg = msg;
		this.age = age;
		this.helloGirl = helloGirl;
	}

	public void printHello(String name) {
		System.out.println(name+"소녀.."+msg+"나는 "+age);
		System.out.println("만나서 반갑다 " +helloGirl.name);
		
	}
}

package test14Aop_1;

public class work {
	private String name;
	private String age;
	private String job;
	
	public void getJobInfo() {
		System.out.println("이름 : "+getName());
		System.out.println("나이 : "+getAge());
		System.out.println("직업 : "+getJob());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
}

package test7;

import java.util.ArrayList;

public class Student {
	private String name;
	private int age;
	private ArrayList<String> hobby;
	private double height;
	private double weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ArrayList<String> getHobby() {
		return hobby;
	}
	public void setHobby(ArrayList<String> hobby) {
		this.hobby = hobby;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", hobby=" + hobby + ", height=" + height + ", weight="
				+ weight + "]";
	}
	public Student(String name, int age, ArrayList<String> hobby) {
		super();
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	
	
}

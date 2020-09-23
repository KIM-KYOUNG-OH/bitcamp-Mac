package day0904;

public class Student {
	String name;
	int age;
	
	public Student() {
		name = "디폴트";
	}
	public Student(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public void write() {
		System.out.println("name:"+name+"\nage:"+age);
	}
}

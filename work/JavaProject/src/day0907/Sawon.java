package day0907;

public class Sawon {
	private String name;
	private int age;
	private String blood;
	private int pay;
	private int sudang;
	
	public Sawon() {
		name = "홍길동";
		age = 30;
		blood = "AB";
		pay = 500;
		sudang = 20;
	}
	
	public Sawon(String name, int age, String blood, int pay, int sudang) {
		this.name=name;
		this.age=age;
		this.blood=blood;
		this.pay=pay;
		this.sudang=sudang;
	}
	
	public Sawon(String name, int age, String blood) {
		this.name=name;
		this.age=age;
		this.blood=blood;
		pay = 200;
		sudang = 3;
	}

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

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int getSudang() {
		return sudang;
	}

	public void setSudang(int sudang) {
		this.sudang = sudang;
	}
	
	public int getTotal() {
		return pay+sudang;
	}
	
}

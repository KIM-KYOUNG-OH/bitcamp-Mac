package day0908;

import java.text.NumberFormat;
import java.util.Scanner;

class Salary{
	private String name;
	private int salary;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	Salary(){
		name = "noname";
		salary = 0;
	}
	
	Salary(String n, int s){
		name = n;
		salary = s;
	}
	
	void getInformation() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.print(name + "\t" + nf.format(salary));
	}
}

class Sawon extends Salary{
	private String department;
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	Sawon() {}

	Sawon(String n, int s, String d){
		super(n, s);
		department = d;
	}
	
	@Override
	void getInformation() {
		super.getInformation();
		System.out.println("\t" + department);
	}

}
public class Ex16InheritMunje {
	Scanner sc;
	int inwon;
	Sawon []s;
	
	public void sawonAdd() {
		sc = new Scanner(System.in);
		System.out.println("인원수를 입력해주세요 : ");
		inwon = Integer.parseInt(sc.nextLine());
		s = new Sawon[inwon];
		
		for(int i=0; i<inwon; i++) {
			s[i] = new Sawon();
			System.out.println("이름 : ");
			s[i].setName(sc.nextLine());
			
			System.out.println("연봉 : ");
			s[i].setSalary(Integer.parseInt(sc.nextLine()));
			
			System.out.println("부서 : ");
			s[i].setDepartment(sc.nextLine());
		}
	}
	
	public void sawonWrite() {
		
		System.out.println("\n<출력>\n");
		System.out.println("번호\t사원명\t연봉\t부서");
		System.out.println("--------------------------------");
		for(int i=0; i<inwon; i++) {
			System.out.print(i+1+"\t");
			s[i].getInformation();
		}
		System.out.println("--------------------------------");
	}
	
	public static void main(String[] args) {
		Ex16InheritMunje ex = new Ex16InheritMunje();
		ex.sawonAdd();
		ex.sawonWrite();
	}

}

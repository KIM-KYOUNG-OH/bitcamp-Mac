package day0908;

class SuperObj5{
	private String name;
	
	SuperObj5(){
		name = "noname";
	}
	
	SuperObj5(String name){
		this.name = name;
	}
	
	public void write(){
		System.out.println("name = " + name);
	}
}

class SubObj5 extends SuperObj5{
	private int score;

	public SubObj5() {
		super();
		score = 90;
	}
	
	public SubObj5(int score) {
		super();
		this.score = score;
	}

	public SubObj5(String name, int score) {
		super(name);
		this.score = score;
	}
	
	public void write() {
		super.write();
		System.out.println("score : " + score);
	}
	
	
}

public class Ex13Inherit {

	public static void main(String[] args) {
		SubObj5 s1 = new SubObj5();
		SubObj5 s2 = new SubObj5(25);
		SubObj5 s3 = new SubObj5("홍길동",40);
		
		s1.write();
		s2.write();
		s3.write();
	}

}

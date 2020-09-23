package day0909;

abstract class Bujang{
	abstract public void play();
	abstract public void draw();
}

abstract class Sawon1 extends Bujang{
	abstract public void dataAdd();
}

class Sawon2 extends Sawon1{
	public void play() {
		System.out.println("피아노를 친다.");
	}
	
	public void draw() {
		System.out.println("그림을 그린다.");
	}
	
	public void dataAdd() {
		System.out.println("데이터 추가");
	}
}

public class Ex4Inherit {

	public static void process(Sawon1 s) {
		s.play(); // 피아노를 친다
		s.draw(); // 그림을 그린다.
		s.dataAdd(); // 데이타 추가
		
	}
	public static void main(String[] args) {
		Sawon1 s = new Sawon2();
		Ex4Inherit ex = new Ex4Inherit();
		ex.process(s);
	}

}

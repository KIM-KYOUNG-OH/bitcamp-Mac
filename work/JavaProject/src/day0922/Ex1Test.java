package day0922;

class SuperObj{
	SuperObj(){
		System.out.println("super 생성자 호출");
	}
	
	public void process() {
		System.out.println("부모 클래스에서 일처리하는 메서드");
	}
}

class SubObj extends SuperObj{
	SubObj(){
		System.out.println("sub 생성자 호출");
	}
	
	@Override
	public void process() {
		System.out.println("자식 클래스에서 먼저 일처리를 한다");
		super.process();
	}
	
	public void show() {
		System.out.println("서브 클래스만이 가지고 있는 메서드");
	}
}

public class Ex1Test {
	
	public static void main(String[] args) {
		SubObj s1 = new SubObj();
		s1.process();
		s1.show();
		
		SuperObj s2 = new SubObj();
		s2.process();
		
	}
}

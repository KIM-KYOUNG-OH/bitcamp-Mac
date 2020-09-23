package day0909;

class Fruit{
	public void show() {
		System.out.println("Fruit show");
	}
}

class Apple extends Fruit{
	@Override
	public void show() {
		super.show();
		System.out.println("Apple show");
	}
	
	public void play() {
		System.out.println("자바공부를 하자");
	}
}

public class Ex1Inherit {

	public static void main(String[] args) {
		Apple a1 = new Apple();
		a1.show();
		a1.play();
		System.out.println();
		Fruit a2 = new Apple();
		// 부모 클래스로 선언, 서브클래스로 생성시
		// 오버라이드된 메서드만 호출이 가능하
		a2.show();
//		a2.play(); // 오류
	}

}

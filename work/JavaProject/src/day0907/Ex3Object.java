package day0907;

// 지역 클래스
// public을 붙일 수 없다
// 같은 패키지 내에서만 접근 가능(파일은 달라도 상관없음)
class Apple{
	int score = 100;
	final static String MESSAGE = "Have a nice day!!!";
}

// public 접근지정자는 파일명과 같은 클래스 앞에만 붙일 수 있다
// public이 붙은 클래스는 다른 패키지에서도 생성이 가능하다
public class Ex3Object {

	public static void main(String[] args) {
		// Apple 클래스의 score와 MESSAGE상수를 출력해보세요
		Apple a = new Apple();
		System.out.println(a.score);
		System.out.println(a.MESSAGE);
		
		Apple a2 = new Apple();
		a2.score=90;
		System.out.println(a2.score);
	}

}

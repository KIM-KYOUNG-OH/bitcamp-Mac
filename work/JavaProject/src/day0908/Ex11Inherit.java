package day0908;

class SuperObj3{
	// 접근지정자 default는 같은 패키지일 경우에만 접근이 가능하다.
	String name;
	int age;
	
	SuperObj3(){
		System.out.println("부모 생성자 호출");
	}
}
/////////////////////////////////////////////////////
class SubObj3 extends SuperObj3{
	String hp;
	SubObj3(){
		System.out.println("자식 생성자 호출");
		name = "이미자";
		age = 30;
		hp = "010-222-3333";
	}
	
	public void write() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("핸드폰 : " + hp);
	}
}

public class Ex11Inherit {

	public static void main(String[] args) {
		SubObj3 sub = new SubObj3();
		// write가 서브클래스에서 오버라이드 되어있다면
		// 서브클래스의 write가 호출된다
		// 만약 없다면 부모클래스의 write가 호출된다.
		sub.write();
	}

}

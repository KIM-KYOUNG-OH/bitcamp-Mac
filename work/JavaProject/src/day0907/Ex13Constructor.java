package day0907;
/*
 *  생성자
 *  1. 리턴타입이 없다
 *  2. 메서드명이 클래스명과 동일
 *  3. 중복처리가 가능하다
 *  4. 주로 멤버변수의 초기값을 담당한다
 */
class Hello{
	Hello(){
		System.out.println("디폴트 생성자 호출");
	}
	Hello(String str){
		System.out.println("생성자 호출");
		System.out.println("전달받은 문자열 " + str);
	}
	Hello(String str, int n){
		System.out.println("생성자 호출");
		System.out.println("이름 : "+str+", 나이 : "+n);
	}
}

public class Ex13Constructor {

	public static void main(String[] args) {
		Hello h1 = new Hello("Hello");
		Hello h2 = new Hello();
		Hello h3 = new Hello("이영자", 23);
	}

}

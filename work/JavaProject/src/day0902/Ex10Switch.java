package day0902;

import java.util.Scanner;

public class Ex10Switch {
	public static void main(String[] args) {
		// 문자 한글자를 입력후 대소문자 상관없이 a를 입력하면
		// 'Apple', b를 입력하면 'Banana', o를 입력하면 'orange' 출력
		// 그 이외는 '과일 없어요'
		Scanner sc = new Scanner(System.in);
		char alpha;
		System.out.println("알파벳 한글자 입력 : ");
		alpha = sc.nextLine().charAt(0);
		System.out.printf("입력한 알파벳은 %c입니다.\n", alpha);
		switch(alpha) {
		// switch문의 case에는 원래 정수타입(char포함)만 올 수 있었는데
		// JDK8부터는 문자열도 가능해졌다.
		case 'a':
		case 'A':
			System.out.println("Apple");
			break;
		case 'b':
		case 'B':
			System.out.println("Banana");
			break;
		case 'o':
		case 'O':
			System.out.println("Orange");
			break;
		default:
			System.out.println("과일 없어요");
		}
	}
}

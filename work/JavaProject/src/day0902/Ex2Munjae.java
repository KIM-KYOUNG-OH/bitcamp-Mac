package day0902;

import java.util.Scanner;

public class Ex2Munjae {
	public static void main(String[] args) {
		// 산술연산자 문제
		// 금액을 입력하면 만원:21장, 천원:4개...1원:3개
		// 위처럼 출력되도록 프로그램을 작성해주세요
		// 예 : 764532..만원:76장, 천원:4개...1원:2개
		Scanner sc = new Scanner(System.in);
		int money;
		
		System.out.println("금액을 입력해주세요 : ");
		money = sc.nextInt();
		
		int man = money / 10000;
		int chun = (money % 10000) / 1000;
		int bak = (money % 1000) / 100;
		int ship = (money % 100) / 10;
		int il = money % 10;
		
		System.out.printf("10000원:%d장, 1000원:%d장, 100원:%d개, 10원:%d개, 1원:%d개",
				man, chun, bak, ship, il);
	}
}

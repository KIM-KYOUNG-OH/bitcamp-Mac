package day0901;

import java.util.Scanner;

public class Ex6Munje {
	public static void main(String[] args) {
		// 상품명, 수량, 단가를 입력받아
		// 상품명, 수량, 단가, 총금액(수량*단가)을 출력하시오
		// 변수명은 자기 마음대로
		// 실행후 아까처럼 캡쳐해서 올려주세요.
		
		Scanner sc = new Scanner(System.in);
		String name;
		int number;
		int price;
		
		System.out.println("상품명을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.println("상품 수량을 입력하세요 : ");
		number = sc.nextInt();
		
		System.out.println("상품 단가를 입력하세요 : ");
		price = sc.nextInt();
		
		System.out.println("총금액은 " + (number*price) + "원입니다.");
	}
}

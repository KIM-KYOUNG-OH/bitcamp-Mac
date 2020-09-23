package day0901;

import java.util.Scanner;

public class Ex8DataType {
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
		
		System.out.printf("%30s\n\n", "**구입상품**"); // 우측정렬
		System.out.printf("%-30s\n\n", "**구입상품**");
		System.out.printf("상품명 : %s\n", name);
		System.out.printf("상품 수량 : %d\n", number);
		System.out.printf("상품 단가 : %d\n", price);
		System.out.printf("총금액은 %d원입니다.", (number*price));
	}
}

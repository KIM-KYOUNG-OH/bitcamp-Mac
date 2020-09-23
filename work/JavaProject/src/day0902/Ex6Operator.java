package day0902;

import java.util.Scanner;

public class Ex6Operator {
	public static void main(String[] args) {
		// 조건(삼항)연산자
		// 조건식 ? 참일때값: 거짓일때값
		// 두수를 입력후 더 큰수를 max변수에 저장후 출력
//		Scanner sc = new Scanner(System.in);
//		int su1, su2, max;
//		System.out.println("두수를 입력하세요 : ");
//		su1 = sc.nextInt();
//		su2 = sc.nextInt();
//		
//		max=(su1>su2)?su1:su2;
//		System.out.println("max = " + max);
		
		Scanner sc = new Scanner(System.in);
		int su1, su2, su3, max;
		
		System.out.println("세수를 입력하세요 : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		su3 = sc.nextInt();
		
		max = (su1>su2)&&(su1>su3)?su1:(su2>su1)&&(su2>su3)?su2:su3;
		System.out.println("max : " + max);
		
	}
}

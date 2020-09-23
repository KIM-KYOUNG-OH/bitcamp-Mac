package day0902;

import java.util.Scanner;

public class Ex25Munje {

	public static void main(String[] args) {
		//숫자를 입력하면 1부터 그 숫자까지의 합을 구하시오
		// 예) 100을 입력하면 5050
		
		// 2 3을 입력하면 "2의 3승은 8입니다."라고 출력
		// 3 3을 입력하면 "3의 3승은 27입니다."라고 출력
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("숫자를 입력하세요 : ");
		num = sc.nextInt();
		int temp = 0;
		for(int i=1; i<=num; i++) {
			temp += i;
		}
		System.out.println(temp);
		System.out.println();
		
		int number;
		int exponent;
		int temp2 = 1;
		System.out.println("두 숫자를 입력하세요 : ");
		number = sc.nextInt();
		exponent = sc.nextInt();
		for(int i=1; i<=exponent; i++) {
			temp2 *= number;
		}
		System.out.printf("%d의 %d승은 %d입니다.", number, exponent, temp2);
	}

}

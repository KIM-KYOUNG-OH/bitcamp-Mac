package day0903;

import java.util.Random;
import java.util.Scanner;

public class Ex3Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100 사이의 난수를 임의로 발생후 그 숫자 알아맞추기
		// 예: 67 이 발생
		// 56 입력시 : 56보다 큽니다
		// 89 입력시 : 89보다 작습니다.
		// 67 입력시 : 정답입니다.(67) - 프로그램 종료
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
//		int num;
//		int ran;
//		
//		System.out.println("숫자를 입력해주세요 : ");
//		num = sc.nextInt();
//		
//		ran = r.nextInt(100)+1;
//		
//		while(num != ran) {
//			if(num > ran) {
//				System.out.printf("%d보다 작습니다.\n", num);
//				System.out.println("숫자를 입력해주세요 : ");
//				num = sc.nextInt();
//			}
//			else {
//				System.out.printf("%d보다 큽니다.\n", num);
//				System.out.println("숫자를 입력해주세요 : ");
//				num = sc.nextInt();
//			}
//		}
//		System.out.printf("정답입니다.(%d) - 프로그램 종료", ran);
		
		int ran = r.nextInt(100)+1;
		int su;
		while(true) {
			System.out.println("숫자입력 : ");
			su = sc.nextInt();
			if(su>ran) {
				System.out.println(su + "보다 작습니다.");
			}else if(su<ran) {
				System.out.println(su+"보다 큽니다.");
			}else {
				System.out.println("정답입니다.("+ran+")");
				break;
			}
		}
		System.out.println("** 정상 종료 **");
	}

}

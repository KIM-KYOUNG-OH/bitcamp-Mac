package day0903;

import java.util.Random;
import java.util.Scanner;

public class Ex4Munje {

	public static void main(String[] args) {
		// 1~100 사이의 난수를 임의로 발생후 그 숫자 알아맞추기
		// 예: 67 이 발생
		// 56 입력시 : 56보다 큽니다
		// 89 입력시 : 89보다 작습니다.
		// 67 입력시 : 정답입니다.(67) - 프로그램 종료
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		Exit:
		while(true) {
			System.out.println("새로운 난수를 발생합니다.");
			int ran = r.nextInt(100)+1;
			int su;
			int count = 0;
			while(true) {
				System.out.println("숫자입력 ("+ ++count + ") : ");
				su = sc.nextInt();
				if(su>ran) {
					System.out.println(su + "보다 작습니다.");
				}else if(su<ran) {
					System.out.println(su+"보다 큽니다.");
				}else {
					System.out.println("정답입니다.("+ran+")");
					System.out.println("계속하시겠습니까?(y/n)");
					sc.nextLine();
					char answer = sc.nextLine().charAt(0);
					if(answer != 'y' || answer != 'Y') {
						break Exit;
					}else {
						continue Exit;
					}
				}
			}
		}
		System.out.println("** 정상 종료 **");
	}

}

package day0904;

import java.util.Random;
import java.util.Scanner;

public class Ex10Munje {

	public static void main(String[] args) {
		/*
		 * 금액을 입력해주세요
		 * 700
		 * 	금액이 부족합니다. 종료합니다.
		 * 
		 * 금액을 입력해주세요
		 * 3000
		 * 
		 * 1 : 5 7 12 23 44 45
		 * 2 : .....
		 * 3 : .....
		 * 
		 * => 숫자는 1~45 사이의 중복되지 않은 숫자라야합니다.
		 * => 오름차순으로 정렬되어야합니다.
		 */
		Scanner sc = new Scanner(System.in);
		int money;
		int countOfLotto;
		int []lotto = new int[6];
		
		System.out.println("금액을 입력해주세요 : ");
		money = Integer.parseInt(sc.nextLine());
		if(money<1000) {
			System.out.println("금액이 부족합니다. 종료합니다.");
			return;
		}else {
			countOfLotto = money/1000;
		}
		
		int time=1;
		Loop:
		while(time <= countOfLotto) {
			Random r = new Random();
			for(int i=0; i<lotto.length; i++) {
				lotto[i] = r.nextInt(45) + 1;
				for(int j=0; j<i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						continue;
					}
				}
			}
			
			for(int i=0; i<lotto.length; i++) {
				for(int j=i+1; j<lotto.length; j++) {
					if(lotto[i]>lotto[j]) {
						int temp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = temp;
					}
				}
			}
			
			System.out.printf("%d : ", time);
			for(int i=0; i<lotto.length; i++) {
				System.out.printf("%2d ", lotto[i]);
			}
			System.out.println();
			time++;
		}
	}
}

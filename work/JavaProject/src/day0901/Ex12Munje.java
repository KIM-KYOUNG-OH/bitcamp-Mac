package day0901;

import java.util.Scanner;

public class Ex12Munje {
	public static void main(String[] args) {
		// 이름과 국어, 영어, 수학, 점수를 입력받아
		// 이름, 총점, 평균을 출력하는데 평균은 소숫점 이하 2자리까지만 출력
		// 모두 printf를 이용해서 출력하세요
		
		Scanner sc = new Scanner(System.in);
		String name;
		int korean;
		int english;
		int math;
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.println("국어점수를 입력하세요 : ");
		korean = sc.nextInt();
		
		System.out.println("영어점수를 입력하세요 : ");
		english = sc.nextInt();
		
		System.out.println("수학점수를 입력하세요 : ");
		math = sc.nextInt();
		
		int total = korean + english + math;
		double average = (double)total/3;
		
		System.out.printf("이름 : %s\n총점 : %d\n평균 : %2.2f",
				name, total, average);
	}
}

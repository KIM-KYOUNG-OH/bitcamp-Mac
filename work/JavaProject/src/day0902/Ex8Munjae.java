package day0902;

import java.util.Scanner;

public class Ex8Munjae {
	public static void main(String[] args) {
		// 이름과 kor, eng, mat 3과목의 점수를 입력하여
		// 평균이 60이상이고 각 과목이 40점 이상이면
		// 홍길동님은 자격증을 취득하였습니다.
		// 그렇지 않으면 
		// 홍길동님은 자격증 취득에 실패하였습니다.
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat;
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.println("국어점수를 입력하세요 : ");
		kor = sc.nextInt();
		
		System.out.println("영어점수를 입력하세요 : ");
		eng = sc.nextInt();
		
		System.out.println("수학점수를 입력하세요 : ");
		mat = sc.nextInt();
		
		int total = kor + eng + mat;
		double average = total/3.0;
		
		System.out.printf("%s님은 자격증 취득에 %s하였습니다.", name,
				(average>=60)&&(kor>=40)&&(eng>=40)&&(mat>=40)?"성공":"실패");
	}
}

package day0903;

import java.util.Scanner;

public class Ex11Array {

	public static void main(String[] args) {

		int[] data = {3,6,9,2,1,12,17,45,23,55};
//		System.out.println(data.length);
		// while 반복문 사용
		// 숫자를 입력하여 몇번째 있는지 출력하기
		// 없을 경우 "없습니다" 출력
		// 0입력하면 종료 출력하고 종료
		int su;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("검색할 숫자를 입력하세요 : ");
			su = sc.nextInt();
			if(su == 0) {
				System.out.println("** 종료 **");
				break;
			}
			
			boolean find = false;
			for(int i=0; i<data.length; i++) {
				if(su==data[i]) {
					find = true;
					System.out.println(i + 1 + "번째에 있어요!!!");
					break;
				}
			}
			
			if(!find) {
				System.out.println(su + " 수는 없습니다.");
			}
			System.out.println();
		}
	}

}

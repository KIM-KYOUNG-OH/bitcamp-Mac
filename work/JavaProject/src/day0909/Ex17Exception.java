package day0909;

import java.util.Scanner;

public class Ex17Exception {
	// Exception을 직접 처리하지 않고 throws로 던지면
	// 호출하는쪽으로 보내진다.
	// 이경우 호출하는 쪽에서 처리를 해야한다.(다시 던지던 try로 처리를 한다.)
	public static void dataAdd() throws NumberFormatException{
		Scanner sc = new Scanner(System.in);
		int su1, su2;
				
		System.out.println("수1 입력 : ");
		su1 = Integer.parseInt(sc.nextLine());
		System.out.println("수2 입력 : ");
		su2 = Integer.parseInt(sc.nextLine());
		System.out.println(su1 + "더하기" + su2 + "는 " + (su1 + su2) + "입니다.");
		
	}
	public static void main(String[] args) {
		try {
			dataAdd();
		} catch (NumberFormatException e) {
//			e.printStackTrace();
			System.out.println("입력시 문자가 섞여있네요 : " + e.getMessage());
		}
		System.out.println("** 정상 종료 **");
	}
}

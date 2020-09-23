package day0904;

import java.util.Scanner;

public class Ex5OX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jungdap = "12134";
		String dap;
		char []ox = new char[5];
		int count = 0;
		
		System.out.println("정답 5개를 입력해주세요 : ");
		dap = sc.nextLine();
		if(dap.indexOf(" ") >= 0) {
			System.out.println("공백은 없이 입력하세요");
			return;
		}else if(dap.length()!=5) {
			System.out.println("정답5개만 입력하세요");
			return;
		}
		
		// 비교
		for(int i=0; i<dap.length(); i++) {
			char d = dap.charAt(i);
			char jd = jungdap.charAt(i);
			if(d == jd) {
				ox[i] = 'O';
				count++;
			}else {
				ox[i] = 'X';
			}
		}
		
		//조건 하나 더 추가(공백이 있을경우 "공백은 안돼요" 메세지후 종료)
		// 힌트 : indexOf
		
		//출력
		System.out.println("정답 : " + jungdap);
		System.out.println("  답 : " + dap);
		// char[]을 String 변환
		String strox = String.valueOf(ox);
		
		System.out.println("채점 : " + strox);
		System.out.println("정답 : " + count+ "개");
		
		System.out.println("** 정상 종료 **");
	}

}

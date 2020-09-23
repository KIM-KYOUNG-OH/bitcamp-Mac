package day0904;

import java.util.Scanner;

public class Ex4OX {

	public static void main(String[] args) {

		/*
		 * 정답과 비교하여 ox출력하기
		 * 정답 1 4 2 3 1
		 *  답  1 2 2 4 3
		 * 채점 o x o x x
		 *   정답: 2개
		 */
		Scanner sc = new Scanner(System.in);
		int []jungdap = {1,4,2,3,1};
		int []dap = new int[5];
		char []ox = new char[5];
		int count = 0;
		// 답입력
		System.out.println("답 5개를 입력해주세요 : (4지선다)");
		for(int i=0; i<dap.length; i++) {
			dap[i]=sc.nextInt();
		}
		
		// 정답 출력
		System.out.print("정답 : ");
		for(int j : jungdap) {
			System.out.print(j + " ");
		}
		System.out.println();
		
		System.out.print("답 : ");
		for(int d : dap) {
			System.out.print(d + " ");
		}
		System.out.println();
		
		System.out.print("채점 : ");
		for(int i=0; i<dap.length; i++) {
			if(jungdap[i] == dap[i]) {
				System.out.print("o ");
				count++;
			}else {
				System.out.print("x ");
			}
		}
		System.out.println();
		System.out.println("정답 : " + count + "개");
	}

}

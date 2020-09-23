package day0903;

import java.util.Scanner;

public class Ex12Array {

	public static void main(String[] args) {

		String[] colors = {"Red", "Green", "Blue", "Yellow", "Pink", "Gray", "Black"};
		// 로직은 아까하고 같은 방식
		// 색상을 입력하면 2번째 있어요!!!
		// 또는 yellow는 없어요
		// q 또는 Q 또는 끝인 경우 종료
		// 단, 대소문자 상관없이 찾아야함
		Scanner sc = new Scanner(System.in);
		String col;
		
		while(true) {
			System.out.println("탐색할 색깔을 입력하세요 : ");
			col = sc.nextLine();
			if(col.equalsIgnoreCase("q") || col.equals("끝")) {
				System.out.println("** 종료 **");
				break;
			}
			
			boolean find = false;
			for(int i=0; i<colors.length; i++) {
				if(colors[i].equalsIgnoreCase(col)) {
					find = true;
					System.out.println(i + 1 +  "번째에 있어요!!!");
					System.out.println();
					break;
				}
			}
			
			if(!find) {
				System.out.println(col + "는 없어요");
			}
		}
	}

}

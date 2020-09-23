package day0909;

import java.util.Scanner;

abstract class Board{
	abstract void process();
}

class InsertBoard extends Board{
	void process() {
		System.out.println("게시판에 데이터를 추가합니다.");
	}
}

class DeleteBoard extends Board{
	void process() {
		System.out.println("게시판에 데이터를 삭제합니다.");
	}
}

class ListBoard extends Board{
	void process() {
		System.out.println("게시판에 데이터를 출력합니다.");
	}
}

class UpdateBoard extends Board{
	void process() {
		System.out.println("게시판에 데이터를 수정합니다.");
	}
}

public class Ex5InheritMunje {
	static void process() {
		Scanner sc = new Scanner(System.in);
		Board b;
		
		Loop:
		while(true) {
			System.out.println("1.추가 2.삭제 3.수정 4.목록출력 5.종료\n선택하세요 : ");
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice == 1) {
				b = new InsertBoard();
				b.process();
			}else if(choice == 2) {
				b = new DeleteBoard();
				b.process();
			}else if(choice == 3) {
				b = new UpdateBoard();
				b.process();
			}else if(choice == 4) {
				b = new ListBoard();
				b.process();
			}else if(choice == 5) {
				System.out.println("종료합니다");
				break Loop; 
			}else {
				System.out.println("다시 입력하세요!!");
			}
		}
	}
	
	public static void main(String[] args) {
		Ex5InheritMunje.process();
	}
}

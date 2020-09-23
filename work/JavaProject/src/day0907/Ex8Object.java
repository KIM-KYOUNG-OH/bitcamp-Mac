package day0907;

import java.util.Scanner;

public class Ex8Object {
	public static void shopInput(Shop []shop) {
		Scanner sc = new Scanner(System.in);
		
		// 데이터 입력
		for(int i=0; i<shop.length; i++) {
			// 생성
			shop[i] = new Shop();
			System.out.println("상품명");
			// 버퍼의 엔터처리
			String name = sc.nextLine();
			shop[i].setName(name);
			
			System.out.println("수량을 입력하세요 : ");
			int cnt = Integer.parseInt(sc.nextLine());
			
			System.out.println("단가를 입력하세요 : ");
			int price = Integer.parseInt(sc.nextLine());
			
			shop[i].setCnt(cnt);
			shop[i].setPrice(price);
			System.out.println();
		}
	}
	
	// 데이터 출력
	public static void shopOutput(Shop []shop) {
		System.out.println("번호\t상품명\t수량\t단가\t총금액");
		for(int i=0; i<shop.length; i++) {
			System.out.println(i+1+"\t"+shop[i].getName()+"\t"+shop[i].getCnt()+"\t"
								+shop[i].getPrice() +"\t"+ shop[i].getTotal());
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shop []shop;
		int count;
		
		System.out.println("저장할 상품의 갯수를 입력하세요 : ");
		count = Integer.parseInt(sc.nextLine());
		shop = new Shop[count];
		
		shopInput(shop);
		shopOutput(shop);
	}

}

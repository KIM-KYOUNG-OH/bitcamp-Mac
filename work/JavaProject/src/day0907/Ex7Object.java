package day0907;

import java.util.Scanner;

public class Ex7Object {

	public static void main(String[] args) {
		// shop에 저장할 갯수를 입력후 할당
		// 상품 정보를 키보드로 입력하여 출력하기
		Scanner sc = new Scanner(System.in);
		Shop []shop;
		int count;
		
		System.out.println("저장할 상품의 갯수를 입력하세요 : ");
		count = sc.nextInt();
		shop = new Shop[count];
		
		// 데이타 입력
		for(int i=0; i<count; i++) {
			// 생성
			shop[i] = new Shop();
			System.out.println("상품명");
			// 버퍼의 엔터처리
			sc.nextLine();
			String name = sc.nextLine();
			shop[i].setName(name);
			
			System.out.println("수량과 단가를 입력하세요 : ");
			int cnt = sc.nextInt();
			int price = sc.nextInt();
			
			shop[i].setCnt(cnt);
			shop[i].setPrice(price);
			System.out.println();
		}
		// 출력
		System.out.println("번호\t상품명\t수량\t단가\t총금액");
		for(int i=0; i<count; i++) {
			System.out.println(i+1+"\t"+shop[i].getName()+"\t"+shop[i].getCnt()+"\t"
								+shop[i].getPrice() +"\t"+ shop[i].getTotal());
		}
	}

}

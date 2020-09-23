package day0907;

public class Ex6Object {

	public static void main(String[] args) {
		System.out.println("1개의 상품만 등록후 출력하기");
		Shop shop1 = new Shop();
		shop1.setName("사과");
		shop1.setCnt(3);
		shop1.setPrice(1200);
		
		System.out.println("상품 : " + shop1.getName());
		System.out.println("수량 : " + shop1.getCnt());
		System.out.println("단가 : " + shop1.getPrice());
		System.out.println("총 금액 : " + shop1.getTotal());
		
		System.out.println("여러개의 상품을 배열에 저장하기");
		Shop []shopData=new Shop[2]; // 객체 배열
		// 3개의 배열에 생성후 값 저장
		shopData[0] = new Shop();
		shopData[1] = new Shop();
		
		shopData[0].setName("오렌지");
		shopData[0].setCnt(5);
		shopData[0].setPrice(3000);
		
		shopData[1].setName("수박");
		shopData[1].setCnt(2);
		shopData[1].setPrice(15000);
		
		// 출력
		for(int i=0; i<shopData.length; i++) {
			Shop s = shopData[i];
			System.out.println(s.getName()+"\t"+s.getCnt()+"\t"+s.getPrice()+"\t"+s.getTotal());
		}
		System.out.println();
		for(Shop s:shopData) {
			System.out.println(s.getName()+"\t"+s.getCnt()+"\t"+s.getPrice()+"\t"+s.getTotal());
		}
	}

}

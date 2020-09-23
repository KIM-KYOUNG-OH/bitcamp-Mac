package day0907;

public class Ex9CallBy {

	public static void changeInt(int m) { // call by value
		System.out.println("전달받은 n값:" + m);
		m=200;
	}
	
	public static void changeString(String str) {
		System.out.println("전달받은 s값:" + str);
		str="java";
	}
	
	public static void changeArray(int []arr) { // call by reference(모든 배열은 주소가 전달)
		arr[1]=7;
	}
	
	public static void changeShop(Shop shop) {
		System.out.println(shop.getName()+"\t" + shop.getCnt()+"\t"+shop.getPrice());
		System.out.println("shop 정보변경");
		shop.setName("딸기");
		shop.setPrice(3300);
	}
	
	public static void main(String[] args) {
		int n=100;
		changeInt(n); // int 기본형은 값만 전달
		System.out.println("n="+n);
		
		String s="happy";
		changeString(s);
		System.out.println("s="+s);
		
		int []arr = {3,5,1,2};
		changeArray(arr); // reference 주소값이 전달
		for( int a: arr) {
			System.out.println(a);
		}
		
		Shop shop = new Shop();
		shop.setName("오렌지");
		shop.setCnt(2);
		shop.setPrice(1500);
		
		changeShop(shop); //주소(reference)가 전달됨
		System.out.println(shop.getName()+"\t" + shop.getCnt()+"\t"+shop.getPrice());
	}

}

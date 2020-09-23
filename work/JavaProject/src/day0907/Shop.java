package day0907;

// 상품명, 수량, 단가 멤버변수

public class Shop {
	private String name;
	private int cnt;
	private int price;
	
	// Setter method
	public void setName(String name) {
		this.name=name;
	}
	
	public void setCnt(int cnt) {
		this.cnt=cnt;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	// Getter method
	public String getName() {
		return name;
	}
	
	public int getCnt() {
		return cnt;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getTotal() {
		return cnt*price;
	}
}

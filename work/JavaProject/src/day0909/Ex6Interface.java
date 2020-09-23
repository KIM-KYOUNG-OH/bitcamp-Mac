package day0909;

// interface는 final상수와 abstract 추상메소드로만 구성
// 음식점의 메뉴판과 같다(실체가 없다)
interface InterA{
	String MSG = "Happy";
	public void showMessage();
}

class WorkA implements InterA{
	
	@Override
	public void showMessage() {
		System.out.println(MSG);
		
	}
}

class WorkB implements InterA{
	String msg = MSG;
	@Override
	public void showMessage() {
		System.out.println("초기값 : " + msg);
		msg = "Nice";
		System.out.println("변경 : " + msg);
	}
}
public class Ex6Interface {
	
	public static void main(String[] args) {
		InterA a = new WorkA();
		a.showMessage();
		
		a = new WorkB();
		a.showMessage();
	}
}

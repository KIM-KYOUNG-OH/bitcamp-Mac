package day0922;

interface InterA{
	public void draw();
	public void close();
}

class Apple{
	public void show() {
		System.out.println("Apple의 show 메서");
	}
}

class Orange extends Apple implements InterA{

	@Override
	public void draw() {
		System.out.println("Orange 클래스에서 draw 메서드 호출");
	}

	@Override
	public void close() {
		System.out.println("Orange 클래스에서 close 메서드 호출");
	}
	
}

public class Test2 {

	public static void main(String[] args) {
		Orange ex1 = new Orange();
		ex1.draw();
		ex1.close();
		ex1.show();
		System.out.println();
		
		Apple ex2 = new Orange();
		ex2.show();
		System.out.println();
		
		InterA ex3 = new Orange();
		ex2.show();
		ex3.draw();
		ex3.close();
	}

}

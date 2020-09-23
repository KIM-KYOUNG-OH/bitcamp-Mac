package day0909;

// abstract메서드를 하나 이상 가진 클래스는
// 반드시 추상화시켜야한다. 방법은 class앞에 abstract를 붙인다.
// 단 추상화된 클래스는 생성할 수 없다(선언만 가능)
// 또 추상클래스를 상속받는 서브클래스는 추상메서드를 반드시 오버라이드 해야한다
// 만약 안할 경우 서브클래스도 추상화시켜야만 한다.
class Fruit2{
	
	// 부모가 가진 메서드가 오버라이드만을 목적으로 하고
	// 따로 처리할 작업이 없다면 추상 메서드로 구현하면 된다.
	// 추상은 abstract라는 단어를 붙이는데 미완성 메서드라는 의미이다.
	public void show() {
		
	}
}

class Apple2 extends Fruit2{
	@Override
	public void show() {
		System.out.println("Apple2 show");
	}
}

class Kiwi2 extends Fruit2{
	@Override
	public void show() {
		System.out.println("Kiwi2 show");
	}
}

class Orange2 extends Fruit2{
	@Override
	public void show() {
		System.out.println("Orange2 show");
	}
}

public class Ex2Inherit {
	
	public static void process(Fruit2 f) {
		f.show();
	}
	public static void main(String[] args) {
		Fruit2 f;
		f=new Apple2();
		f.show();
		
		f=new Kiwi2();
		f.show();
		
		f=new Orange2();
		f.show();
		
		System.out.println();
		System.out.println("메서드를 통해서 일처리하기");
		process(new Apple2());
		process(new Kiwi2());
		process(new Orange2());
		
		
	}
}

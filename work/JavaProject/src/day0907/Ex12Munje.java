package day0907;

class MyMath{
	public static int abs(int a) {
		if(a<0) {
			a*= (-1);
		}
		return a;
	}
	
	public static double abs(double a) {
		if(a<0) {
			a*= -1;
		}
		return a;
	}
	public static float abs(float a) {
		if(a<0) {
			a *= (-1);
		}
		return a;
	}
	
	public static char toLower(char ch) {
		if(ch>='A' && ch<='Z') {
			ch+=32;
		}
		return ch;
	}
	
	public static char toUpper(char ch) {
		if(ch>='a' && ch<='z') {
			ch -= 32;
		}
		return ch;
	}
	
	public static int pow(int n, int m) {
		int result = 1;
		for(int i=0; i<m; i++) {
			result *= n;
		}
		return result;
	}
}
public class Ex12Munje {
	
	public static void main(String[] args) {
		System.out.println(Math.abs(-9));
		System.out.println(Math.abs(8));
		System.out.println(Math.abs(-1.2));
		System.out.println(Math.abs(3.4));
		System.out.println(Math.abs(-2.3f));
		System.out.println(Math.pow(3, 4));
		System.out.println("** 직접 메서드를 만들어보세요 **");
		System.out.println(MyMath.abs(-9));
		System.out.println(MyMath.abs(8));
		System.out.println(MyMath.abs(-1.2));
		System.out.println(MyMath.abs(3.4));
		System.out.println(MyMath.abs(-2.3f));
		
		System.out.println(MyMath.toLower('A')); // 무조건 소문자로 출력
		System.out.println(MyMath.toLower('b'));
		System.out.println(MyMath.toUpper('D')); // 무조건 대문자로 출력
		System.out.println(MyMath.toUpper('B'));
		System.out.println(MyMath.pow(3, 4)); // 3의 4승 결과구하기
	}

}

package day0901;

public class Ex11DataType {

	public static void main(String[] args) {
		// 묵시적 형변환
		char a = 'A';
		System.out.println(a+2); // 결과는 자동으로 int
		System.out.println((char)(a+2)); // (char) cast 연산자를 통해서 형변환
		System.out.println("^^:"+5+3); // +는 앞에서부터 연산 - 전체적으로 String
		System.out.println("^^:"+(5+3)); // +는 먼저 계산되도록 하려면 ()로 묶어준다
		System.out.println(7/4); // 결과는 int 1
		System.out.println(7.0/4);
		System.out.println(7/4.0);
		System.out.println((double)7/4);
	}
}

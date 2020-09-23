package day0902;

public class Ex4Operator {
	public static void main(String[] args) {
		// 증감연산자 ++, --
		// 단항일경우는 앞에 또는 뒤에 어디에 붙던 상관없다
		// 단항이 아닐경우는 전치일경우는 1순위, 후치일경우는 끝순위
		int a = 5, b = 5;
		++a;
		b++;
		System.out.println(a+","+b);
		// 출력시 증감 연산자 사용
		System.out.println(++a);
		System.out.println(b++);
		
		System.out.println(a+","+b);
		
		int m,n;
		m=n=6;
		a=b=5;
		a += m++ - --b;
		System.out.printf("%d, %d, %d\n", a, b, m);
		m=n=a=b=3;
		m=++a;
		n=b++;
		System.out.printf("%d, %d, %d, %d,", a, b, m, n);
	}
}

package day0902;

public class Ex15Loop {

	public static void main(String[] args) {

		int n=0;
		while(true) {
			System.out.println(++n);
			if(n==5) {
				break; // while문을 빠져나간다
			}
		}
		System.out.println("**종료**");
		// A~Z까지를 출력해보자
		int a=65;
		while(true) {
			System.out.print((char)a++);
			if(a>90) {
				break;
			}
		}
	}

}

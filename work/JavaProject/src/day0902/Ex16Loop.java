package day0902;

public class Ex16Loop {

	public static void main(String[] args) {
		int n=0;
		// 1부터 20까지 짝수만 출력하라
		while(true) {
			n++;
			if(n%2==1) {
				continue; // 아래의 명령을 실행하지 않고 다시 조건으로 돌아간다.
			}
			System.out.println(n);
			// 종료 코드
			if(n==20) {
				break;
			}
		}
		System.out.println("\n**종료**");
	}

}

package day0908;

import java.util.StringTokenizer;

public class Ex8Token {

	public static void main(String[] args) {
		// 특정 기호로 문자열을 분리하는 방법
		// 2가지
		// 1. split 메서드
		// 2. StringTokenizer
		
		String msg = "red,green,blue,gray,white,yellow";
		StringTokenizer st = new StringTokenizer(msg, ",");
		int count = st.countTokens(); // 분리할 수 있는 토크 갯수 반환
		System.out.println(count);
		while(st.hasMoreTokens()) {
			// 남은 토큰이 있을 경우 true
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		String []data = msg.split(",");
		for(String d: data) {
			System.out.println(d);
		}
	}

}

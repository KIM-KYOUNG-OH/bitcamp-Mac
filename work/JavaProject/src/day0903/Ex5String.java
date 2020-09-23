package day0903;

public class Ex5String {

	public static void main(String[] args) {
		// String 객체 생성
		String s1 = new String("apple");
		String s2 = "Apple";
		String msg = "Have a Nice Day!!";
		String msg2 = "    Happy day    ";
		System.out.println("length = " + msg.length());
		System.out.println("length = " + msg2.length());
		System.out.println("length = " + msg2.trim().length()); // 양쪽 공백 제거후 길이
		System.out.println(msg.charAt(7)); // N, 0부터 계산
		System.out.println(msg.indexOf('a', 4)); // 4번지부터 검색시 a의 위치
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.concat("Orange")); // 기존 문자열에 Orange 추가해서 반환
		System.out.println(s1);
		System.out.println(msg.endsWith("Day!!")); // 해당 문자열로 끝나면 true
		System.out.println(msg.endsWith("Day!!!"));
		System.out.println(msg.startsWith("Have")); // 해당 문자열로 시작하면 true
		System.out.println(msg.startsWith("Haha"));
		System.out.println(msg.replace("a", "*")); // 모든 a가 *로 변경되어 반환
		System.out.println(msg.substring(7)); // 7번 인덱스부터 끝까지 추출
		System.out.println(msg.substring(7, 10)); // 7~9번까지 추출
		
		// 비교
		System.out.println(s1 == s2); // 객체에서의 ==는 주소 비교를 의미
		System.out.println(s1.equals(s2)); // 값을 비교
		System.out.println(s1.equalsIgnoreCase(s2)); // 대소문자 구분x
		
		// 같을경우 0
		// a가 b보다 크면 양수값
		System.out.println(s1.compareTo("apple"));
		System.out.println(s1.compareTo("Apple"));
		System.out.println(s1.compareTo("Banana"));
		System.out.println(s1.compareTo("application"));
		System.out.println("Orange".compareTo("purple"));
		
		// split : 특정 문자로 분리(배열형태)
		String s = "red,green,blue,yellow";
		// ,로 분리
		String[] arr = s.split(",");
		for(String a : arr) {
			System.out.println(a);
		}
		
		// valueOf : 어떤 데이타든 문자열로 변환해서 반환
		String a1 = String.valueOf('A');
		String a2 = String.valueOf(1234);
		System.out.println(a1);
		System.out.println(a2 + "12");
	}

}

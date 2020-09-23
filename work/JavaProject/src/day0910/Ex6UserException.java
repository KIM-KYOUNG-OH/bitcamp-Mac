package day0910;

import java.util.Scanner;

// 사용자 이셉션
// throw를 이용해서 강제로 이셉션을 발생시킨다
class UserException extends Exception{
	public UserException(String msg) {
		super(msg);
	}
}

// 이름과 나이를 입력받는데
// 이름에 "김태희"를 입력하면 exception발생 
// 나이는 50세가 넘으면 이셉션 발생
public class Ex6UserException {
	public static void dataInput() throws UserException{
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine();
		if(name.equals("김태희")) {
			throw new UserException("정확한 이름을 입력하세요");
		}
		System.out.println("나이 입력 : ");
		age = sc.nextInt();
		if(age >= 50) {
			throw new UserException("나이가 너무 많아여!!!");
		}
		System.out.println(name + "님의 나이는 " + age + "세입니다.");
	}

	public static void main(String[] args) {
		try {
			dataInput();
		} catch (UserException e) {
			System.out.println("에러 메세지 : " + e.getMessage());
		}
		System.out.println("정상종료");
	}
}

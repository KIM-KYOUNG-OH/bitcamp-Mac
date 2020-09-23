package day0907;

public class Ex15Munje {

	public static void main(String[] args) {
		// sawon 클래스는 파일 따로 만들기(같은 패키지에)
		/*
		 *  Sawon클래스
		 *  멤버변수 이름(name), 나이(age), 혈액형(blood), 급여(pay), 수당(sudang)
		 */
		Sawon []arr = new Sawon[4];
		arr[0]=new Sawon();
		arr[1]=new Sawon("이선희", 23, "B", 340, 5);
		arr[2]=new Sawon("강호동", 31, "A"); //pay는 기본 200, 수당은 기본3으로 초기값 주기
		arr[3]=new Sawon("손혁", 23, "O", 460, 12);
		
		// 출력하는데
		// pay+sudeng을 반환하는 getTotal() 메서드를 만든후 호출하기
		// 이름, 나이, 혈액형, 급여, 수당, 총금액 순서로 출력하는데
		// 모든 출력값은 getter메서드 호출하여 출력하기
		System.out.println("이름\t나이\t혈액형\t급여\t수당\t총금액");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].getName()+"\t"+arr[i].getAge()+"\t"+arr[i].getBlood()+"\t"+
							arr[i].getPay()+"\t"+arr[i].getSudang()+"\t"+arr[i].getTotal());
		}
		System.out.println();
		System.out.println("값 변경하기");
		arr[1].setAge(30);
		arr[2].setName("강부자");
		arr[3].setPay(410);
		arr[3].setSudang(8);
		
		System.out.println("**다시 출력하기**");
		System.out.println("이름\t나이\t혈액형\t급여\t수당\t총금액");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].getName()+"\t"+arr[i].getAge()+"\t"+arr[i].getBlood()+"\t"+
							arr[i].getPay()+"\t"+arr[i].getSudang()+"\t"+arr[i].getTotal());
		}
	}

}

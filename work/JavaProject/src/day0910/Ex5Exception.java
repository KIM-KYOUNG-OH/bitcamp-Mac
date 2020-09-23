package day0910;

public class Ex5Exception {

	public static void main(String[] args) {
		
		System.out.println("안녕하세요..3초후에 봐요");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.getStackTrace();
		}
		System.out.println("잘 가세요");
	}
}

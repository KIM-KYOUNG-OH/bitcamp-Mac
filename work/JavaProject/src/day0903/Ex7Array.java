package day0903;

public class Ex7Array {

	public static void main(String[] args) {
		String []str = {"apple", "orange", "banana"};
		double []num = {1.2, 4.5, 7.1, 9.0};
		System.out.println(str.length);
		System.out.println(num.length);
		System.out.println();
		
		for(String i : str) {
			System.out.println(i);
		}
		System.out.println();
		
		for(double i : num) {
			System.out.println(i);
		}
	}

}

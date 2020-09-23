package day0902;

public class Ex24Munje {

	public static void main(String[] args) {
		
		int n = 1;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<i; j++) {
				System.out.print("*");
			}
			for(int j=i; j<=5; j++) {
				if(j == i) {
					System.out.print(j);
					continue;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

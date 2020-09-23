package day0902;

public class Ex21Gugudan {

	public static void main(String[] args) {
//		for(int dan=2; dan<=9; dan++) {
//			System.out.println("** " + dan + "단 **");
//			for(int i=1; i<=9; i++) {
//				System.out.printf("%3d x %d = %2d\n", dan, i, dan*i);
//			}
//			System.out.println();
//		}
		for(int i=2; i<=9; i++) {
			System.out.printf("%14d단", i);
		}
		System.out.println();
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.printf("\t%2d x %d = %2d", j, i, i*j);
			}
			System.out.println();
		}
	}

}

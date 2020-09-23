package day0904;

import java.util.Scanner;

public class Ex3Rank {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int inwon; // 인원수 입력하여 인원수만큼 배열 할당
		String []name;
		int [] java, jsp;
		int []rank;
		int []tot;
		
		System.out.println("인원수를 입력하세요 : ");
		inwon = sc.nextInt();
		name = new String[inwon];
		java = new int[inwon];
		jsp = new int[inwon];
		rank = new int[inwon];
		tot = new int[inwon];
		
		for(int i=0; i<name.length; i++) {
			System.out.println("이름을 입력해주세요 : ");
			sc.nextLine();
			name[i] = sc.nextLine();
			System.out.println("java와 jsp점수를 입력하세요 : ");
			java[i] = sc.nextInt();
			jsp[i] = sc.nextInt();
			tot[i] = java[i] + jsp[i];
		}
		System.out.println();
		
		for(int i=0; i<name.length; i++) {
		}
		
		for(int i=0; i<name.length; i++) {
			rank[i] = 1;
			for(int j=0; j<name.length; j++) {
				if(tot[i]<tot[j]) {
					rank[i]++;
				}
			}
		}

		System.out.println("번호\t이름\tjava\tjsp\t총점\t등수");
		for(int i=0; i<name.length; i++) {
			System.out.println(i+1+"\t"+name[i]+"\t"+java[i]+"\t"+jsp[i]+"\t"+tot[i]+"\t"+rank[i]);
		}
		/*
		 * 인원수를 입력하여 그 인원수 만큼 전체 배열 할당
		 * 이름과 두과목의 점수를 입력후 총점과 등수를 구한후 출력하기
		 * 출력은
		 * 번호 이름 java jsp 총점 등수
		 */
		
		// 1. 인원수 입력
//		System.out.println("인원수를 입력하세요 : ");
//		inwon = Integer.parseInt(sc.nextLine());
//		// 2. 배열 할당
//		name = new String[inwon];
//		java = new int[inwon];
//		jsp = new int[inwon];
//		rank = new int[inwon];
//		tot = new int[inwon];
//		
//		// 3. 데이터 입력, 총점 계산
//		for(int i=0; i<inwon; i++) {
//			System.out.println("이름 입력 : ");
//			name[i] = sc.nextLine();
//			System.out.println("java와 jsp점수를 입력하세요");
//			java[i] = Integer.parseInt(sc.nextLine());
//			jsp[i] = Integer.parseInt(sc.nextLine());
//			// 총점 구하기
//			tot[i] = java[i]+jsp[i];
//		}
//		// 4. 등수
//		for(int i=0; i<inwon; i++) {
//			rank[i]=1;
//			for(int j=0; j<inwon; j++) {
//				if(tot[i]<tot[j]) {
//					rank[i]++;
//				}
//			}
//		}
//		// 5. 출력
//		System.out.println("번호\t이름\tjava\tjsp\t총점\t등수");
//		for(int i=0; i<name.length; i++) {
//			System.out.println(i+1+"\t"+name[i]+"\t"+java[i]+"\t"+jsp[i]+"\t"+tot[i]+"\t"+rank[i]);
//		}
	}

}

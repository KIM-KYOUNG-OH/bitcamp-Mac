package day0911;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex2FileWrite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, hp;
		FileWriter fw = null;
		try {
			fw = new FileWriter("/Users/kimgyeong-o/bitcampJAVA/info.txt", true);
			while(true) {
				System.out.println("이름을 입력하세요 : ");
				name = sc.nextLine();
				if(name.equals("끝")) {
					break;
				}
				fw.write("이름 : " + name + "\n");
				System.out.println("핸드폰 번호를 입력하세요 : ");
				hp = sc.nextLine();
				fw.write("핸드폰 : " + hp + "\n");
				fw.write("=======================");
			}
			System.out.println("info.txt 파일을 확인하세요");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}

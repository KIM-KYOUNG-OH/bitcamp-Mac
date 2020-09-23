package day0911;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Ex1FileWrite {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
//			fw = new FileWriter("/Users/kimgyeong-o/bitcampJAVA/test1.txt"); 
			// 파일이 없으면 새로생성, 있으면 덮어씀
			fw = new FileWriter("/Users/kimgyeong-o/bitcampJAVA/test1.txt", true);
			// 파일이 없으면 새로생성, 있으면 기존내용에 추가
			fw.write("Hello\n안녕하세요\n" + new Date().toString() + "\n=========\n");
			System.out.println("파일을 확인하세요");
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

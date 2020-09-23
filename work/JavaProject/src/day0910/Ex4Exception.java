package day0910;

import java.io.FileWriter;
import java.io.IOException;

public class Ex4Exception {

	public static void main(String[] args) {
		// 파일에 저장
		FileWriter fw = null;
		String fileName = "/Users/kimgyeong-o/bitcampJAVA/memo.txt";
		try {
			fw = new FileWriter(fileName);
			fw.write("파일에 저장했어요");
			System.out.println("파일확인");
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

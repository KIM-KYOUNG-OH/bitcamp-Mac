package day0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex17Reader {

	public static void main(String[] args) {
		String msg = null;
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("문자열 입력");
		try {
			msg = br.readLine(); // 한줄을 읽는다
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(msg);
	}
}

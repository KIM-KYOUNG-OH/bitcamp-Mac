package day0910;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Ex19FileMunje {
	
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("/Users/kimgyeong-o/bitcampJAVA/student.txt");
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을수 없습니다 : " + e.getMessage());
		}
		BufferedReader br = new BufferedReader(fr);
		StringTokenizer st;
		
		try {
			String name = "";
			String blood = "";
			int java = 0;
			int html = 0;
			int total = 0;
			double average = 0;
		
			System.out.println("** 파일 읽기 **");
			System.out.println("이름\t혈액형\tjava\thtml\t합계\t평균");
			System.out.println("----------------------------------------------");
			Loop:
			while(true) {
					String msg = br.readLine();
					if(msg == null) {
						break Loop;
					}
					st = new StringTokenizer(msg, ",");
					name = st.nextToken();
					blood = st.nextToken();
					java = Integer.parseInt(st.nextToken());
					html = Integer.parseInt(st.nextToken());
					
					total = java+html;
					average = total/2.0;
					System.out.println(name + "\t" + blood + "\t" + java + "\t" + html + "\t" +
					total + "\t" + average);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

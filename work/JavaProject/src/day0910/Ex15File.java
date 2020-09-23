package day0910;

import java.io.File;

public class Ex15File {

	public static void main(String[] args) {
		String path = "/Users/kimgyeong-o/bitcampJAVA/";
		File file1 = new File(path + "memo.txt");
		File file2 = new File(path + "ppt");
		File file3 = new File(path + "hello.txt");
		
		System.out.println(file1.isDirectory());
		System.out.println(file2.isDirectory());
		System.out.println(file1.isFile());
		System.out.println(file2.isFile());
		System.out.println("memo.txt는 " + file1.length() + "Byte");
		
		System.out.println(file1.exists()); // 존재하면 true
		System.out.println(file3.exists()); // 존재하지 않으므로 false
		System.out.println(file1.getAbsolutePath()); // 절대경로
		System.out.println(file2.getAbsolutePath()); // 절대경로
		System.out.println(file1.getName()); // 파일명만 얻기
		System.out.println(file1.canExecute());
		System.out.println(file1.canRead());
		System.out.println(file1.canWrite());
		
		System.out.println("ppt가 만약 디렉토리라면 목록을 출력하라");
		if(file2.isDirectory()) {
			String []list = file2.list();
			for(String a: list) {
				System.out.println(a);
			}
		}
		
		System.out.println("파일 삭제하기");
		if(file1.exists()) {
			file1.delete();
			System.out.println("파일1을 삭제했습니다.");
		}else {
			System.out.println("파일3은 존재하지 않습니다.");
		}
	}
}

package day0910;

import java.util.HashSet;

public class Ex8Set {

	public static void main(String[] args) {
		String []str = {"Java", "Beans", "Java", "XML", "XML"};
		HashSet<String> hs1 = new HashSet<>();
		HashSet<String> hs2 = new HashSet<>();
		
		for(String n : str) {
			// hs1에 중복된 값이 있어서 추가가 안되는 경우에는
			// hs2에 추가를 하시오 라는 뜻
			if(!hs1.add(n)) {
				hs2.add(n);
			}
		}
		System.out.println(hs1);
		System.out.println(hs2);
		System.out.println();
		hs1.removeAll(hs2);
		System.out.println(hs1);
		System.out.println(hs2);
	}
}

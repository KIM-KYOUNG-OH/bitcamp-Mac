package day0910;

import java.util.Iterator;
import java.util.Vector;

public class Ex10Vector {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>();
		Vector<String> v2 = new Vector<String>(5);
		System.out.println("size : " + v1.size());
		System.out.println("size : " + v2.size());
		
		System.out.println("capacity : " + v1.capacity());
		System.out.println("capacity : " + v2.capacity());
		
		v2.add("apple");
		v2.add("banana");
		v2.add("apple");
		v2.add("orange");
		v2.add("banana");
		v2.add("melon");
		System.out.println("size : " + v2.size());
		System.out.println("capacity : " + v2.capacity());
		
		System.out.println(v2);
		System.out.println();
		System.out.println("<출력 1>");
		for(String s: v2) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println("<출력 2>");
		for(int i=0; i<v2.size(); i++) {
			String s = v2.get(i);
			System.out.println(i + " : " + s);
		}
		System.out.println();
		System.out.println("<출력 3>");
		Iterator<String> it = v2.iterator();
		while(it.hasNext()) {
			// 다음 데이터가 있으면 true반환
			String s = it.next();
			System.out.println(s);
		}
	}
}

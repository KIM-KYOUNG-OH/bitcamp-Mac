package day0910;

import java.util.HashSet;
import java.util.Set;

public class Ex7Set {

	public static void main(String[] args) {
		// set의 특징
		// 1. 순서 없이 들어간다(비순차적)
		// 2. 중복된 데이터는 한번만 들어간다
		Set<String> set1 = new HashSet<>(); //생성부분의 제네릭 타입은 생략가능
		System.out.println(set1.add("apple"));
		System.out.println(set1.add("orange"));
		System.out.println(set1.add("Orange"));
		System.out.println(set1.add("apple"));
		System.out.println(set1.add("melon"));
		System.out.println(set1.add("kiwi"));
		
		System.out.println("size : " + set1.size());
		
		for(String s : set1) {
			System.out.println(s);
		}
		set1.clear();
		System.out.println(set1);
	}
}

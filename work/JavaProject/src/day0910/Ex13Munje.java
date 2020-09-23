package day0910;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day0908.Person;

public class Ex13Munje {

	List<Person> list;
	static Scanner sc;
	
	public Ex13Munje() {
		list = new ArrayList<Person>();
		sc = new Scanner(System.in);
	}
	
	public void dataAdd() {
		Person p = new Person();
		System.out.println("이름 : ");
		p.setName(sc.nextLine());
		System.out.println("태어난 년도 : ");
		p.setYear(Integer.parseInt(sc.nextLine()));
		System.out.println("키 : ");
		p.setHeight(Integer.parseInt(sc.nextLine()));
		System.out.println("몸무게 : ");
		p.setWeight(Integer.parseInt(sc.nextLine()));
		list.add(p);
		System.out.println(list.size() + "번째 데이터 추가!!!");
	}
	
	public void dataDel() {
		System.out.println("삭제할 데이터 이름 : ");
		String name = sc.nextLine();
		for(int i=0; i<list.size(); i++) {
			Person p = list.get(i);
			if(name.equals(p.getName())) {
				list.remove(i);
				System.out.println("삭제되었습니다");
				return;
			}
		}
		System.out.println("삭제할 데이터가 없습니다");
	}
	
	public void dataAllWrite() {
		System.out.println("순서\t이름\t년도\t키\t몸무게\t평가");
		for(int i=0; i<list.size(); i++) {
			System.out.println((i+1) + "번\t" + list.get(i).getName() +"\t"+ list.get(i).getYear()
					+"\t"+ list.get(i).getHeight()+"\t"+ list.get(i).getWeight()+"\t"+ list.get(i).getPungga());
		}
	}
	
	public static int getMenu(int num) {
		return num;
	}
	
	public static void main(String[] args) {
		Ex13Munje ex = new Ex13Munje();
		Loop:
		while(true) {
			System.out.println("========================================");
			System.out.println("1.추가  2.삭제  3.전체출력  4.종료");
			System.out.println("번호를 입력하세요 : ");
			int num = Integer.parseInt(sc.nextLine());
			if(getMenu(num) == 1) {
				ex.dataAdd();
			}else if(getMenu(num) == 2) {
				ex.dataDel();
			}else if(getMenu(num) == 3) {
				ex.dataAllWrite();
			}else if(getMenu(num) == 4) {
				break Loop;
			}else {
				System.out.println("잘못입력했습니다.");
			}
		}
		System.out.println("정상 종료");
	}
}

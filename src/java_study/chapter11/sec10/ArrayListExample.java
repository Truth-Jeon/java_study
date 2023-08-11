package java_study.chapter11.sec10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database"); // INSERT(삽입)
		list.add("iBATIS");

		System.out.println(list);

		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();

		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();

		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}

		// 왼쪽은 제너릭이 쓰임, 오른쪽은 제너릭이 생략됨
		List<String> list1 = Arrays.asList("홍길동", "신용권", "감자바"); // 읽기 전용
		// add가 안됨.
		// list1.add("고길동"); // 에러남
		// list1.remove(0);//remove() 도 에러남.
		// 대신, set처럼 기존것을 교체는 가능함.
		list1.set(0, "고길동");
		for (String name : list1) {
			System.out.println(name);
		}

		List<Integer> list2 = Arrays.asList(1, 2, 3);// 읽기 전용
		for (int value : list2) {
			System.out.println(value);
		}

		List<String> initList = Arrays.asList("홍길동", "신용권", "감자바");
		List<String> list3 = new ArrayList(initList); // 다시 ArrayList로 재정의 하면 add, remove 가능.
		list3.set(0, "고길동");
		list3.remove(0);
		list3.add("고길동");
		list3.addAll(initList);
	}
}

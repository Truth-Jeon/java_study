package java_study.chapter11.sec07;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		// 의미하는 것 : 기본 데이터 타입 (primitive)
		int[] scores = { 20, 10, 13 };
		Arrays.sort(scores); // 기본 데이터(primitive) 타입에 한해서는 정렬을 해줌.
		// 문제는 참조타입...

		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]= " + scores[i]);
		}
		System.out.println(Arrays.toString(scores));

		String[] names = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names);

		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]=" + names[i]);
		}
		// 놀랍게도!!! 정렬이 된다. (String은 자바가 만든 참조클래스라서 가능한거임)
		System.out.println(Arrays.toString(names));

		Member[] members = { new Member("홍길동", 33), new Member("박동수", 23), new Member("김민수", 44) };
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
	}

}

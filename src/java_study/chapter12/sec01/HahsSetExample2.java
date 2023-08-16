package java_study.chapter12.sec01;

import java.util.HashSet;
import java.util.Set;

public class HahsSetExample2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();

		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));

		System.out.println("총 객체수 : " + set.size()); // 1 -> Member.java 에서 hashCode() 메서드를 주석처리하면 2가 나옴.
	}

}

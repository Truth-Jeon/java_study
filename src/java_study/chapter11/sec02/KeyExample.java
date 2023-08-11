package java_study.chapter11.sec02;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		// Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();

		// 식별키 "new Key(1)" 로 "홍길동"을 저장함
		hashMap.put(new Key(1), "홍길동");

		// 식별키 "new Key(1)"로 "홍길동"을 읽어옴
		String value = hashMap.get(new Key(1)); // 디폴트 해쉬코드를 쓰고있다.
		System.out.println(value); // 값이 다르기 때문에 null (못찾음)

		Object obj = new Object();
		System.out.println(obj); // 값이 같게 나옴. 16진수
		System.out.println(obj.hashCode()); // 10진수
		// 16진수를 10진수로 치환하면 같게 나옴.
	}
}

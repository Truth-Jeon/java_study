package java_study.chapter12.sec02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();

		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);

		System.out.println("총 Entry 수: " + map.size());

		// 객체 찾기
		System.out.println("\t홍길동 : " + map.get("홍길동")); // Map을 쓰는 이유 : 키(내용)을 기반으로 검색을 하기 때문에
		System.out.println();

		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		for (String key : map.keySet()) {
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}

		// 객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
	}

}

package java_study.chapter03;

public class InputTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10;
		int n2 = 4;

		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2); // **** 자바는 정수/정수 = 정수 이다. (항상) 즉, 몫만 구함.
		// 정수 / 실수 또는 실수 / 정수 는 실수로 결과값이 나옴.
		System.out.println(n1 / 4.0);
		// 정수 -> 실수로 해석 : 데이터 타입변환
		// 종류:
		// 1. 자동(묵시적) 타입 변환: Promotion
		// 2. 강제(명시적) 타입 변환:
		// 자동타입변환 : 정보손실이 없을 때(작은 타입 -> 큰 타입 : 정수 -> 실수)
		// 반대방향(큰 -> 작은 타입)의 경우 정보손실이 일어날 수 있음. -> 자동변환이 불가능

		// /를 실수계산값을 출력
		System.out.println(n1 / (double) n2); // 둘 중 하나가 실수가 됨. 앞, 뒤 상관없음.
		// 단항연산자가 이항연산자보다 더 순서가높다. 형변환 먼저 한 후에 나누기를 함.
		System.out.println((double) (n1 / n2)); // 이거는 우리가 원하는 것과는 다른 결과가 나옴.
	}

}

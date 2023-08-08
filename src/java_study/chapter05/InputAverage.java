package java_study.chapter05;

import java.util.Scanner;

public class InputAverage {

	// SRP (Single Responsibility Principal) : 단일 책임의 원칙
	// 기능별로 메서드를 쪼개주는 것이 중요함.
	public static void main(String[] args) {
		// 입력을 여러 번 여러 개 받아서 저장공간에 넣고 싶을 때 = 배열을 사용함.
		// 1. 배열을 만들어주세요.
		int[] jumsu = new int[5];

		Scanner sc = new Scanner(System.in);
		// 배열에 값을 넣을 때는 index가 필요 ==> i가 있는 for문 사용해야함.
		System.out.println("숫자 5개를 입력하세요. (구분 띄어쓰기 필수) >>");
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = sc.nextInt();// 이렇게 입력하면 버퍼링이 일어남.
			// 엔터 앞에 데이터를 여러 개 줄 수 있음.
		}

		for (int x : jumsu) {
			System.out.print(x + " ");
		}
		System.out.println();

		// jumsu[0] ==> jumsu 변수에 들어있는 주소가 가리키는 0번 인덱스 공간
		// 0???? ==? 위치값, 인덱스

		// 1. 전체 합계 구해서, 평균 구하기
		// ==> 평균 = 합계 / 전체갯수
		int sum = 0;
		for (int x : jumsu) {
			sum = sum + x; // sum += x;
		}
		System.out.println("전체 합계: " + sum);
		double avg = (double) sum / jumsu.length;
		System.out.println("전체평균 : " + avg);
	}
}

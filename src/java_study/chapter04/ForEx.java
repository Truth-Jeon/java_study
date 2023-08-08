package java_study.chapter04;

import java.util.Scanner;

public class ForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			// 짝수만 더하기
			if (i % 2 == 0) {
				sum = sum + i; // sum += i; 와 같은 뜻.
			}
		}

		// 다시 계산하기 위해서 0으로 초기화
		sum = 0;
		for (int i = 2; i <= 100; i += 2) {
			// 짝수만 더하기
			sum = sum + i;
		}
		System.out.println("1~100까지 짝수의 합 :" + sum);

		// 사용자의 입력값까지 짝수의 합 구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("원하시는 숫자를 입력해주세요 >>");
		int num = sc.nextInt();

		sum = 0;

		for (int i = 2; i <= num; i += 2) {
			sum = sum + i;
		}

		System.out.printf("사용자가 입력한 숫자(%d)까지의 짝수의 합 : %d", num, sum);
	}

}

package java_study.chapter05;

import java.util.Scanner;

public class ArrayEx8 {

	public static void main(String[] args) {
		// 5개의 점수를 받아서 평균을 출력
		int[] jumsu = new int[5];
		Scanner sc = new Scanner(System.in);

		ArrayUtil.getNumbers("점수 >> ", jumsu);
		ArrayUtil.showNumbers(jumsu);
		int sum = ArrayUtil.addAll(jumsu);

		double avg = (double) sum / jumsu.length;
		System.out.printf("합계는 : %d 입니다.\n", sum);
		System.out.printf("평균은 : %.1f 입니다.", avg);
	}

}

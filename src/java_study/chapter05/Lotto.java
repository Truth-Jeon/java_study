package java_study.chapter05;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random r = new Random(42);// 씨앗(seed)
		// 값을 고정시켜놓고, 같은 패턴의 랜덤한 숫자로 비교하는 것.
		for (int i = 0; i < lotto.length; i++) { // 6번
			lotto[i] = r.nextInt(45) + 1;
		}
		System.out.println();
		int count = 0;
		for (int x : lotto) {
			if (x >= 30) {
				count++;
			}
		}
		System.out.println(count);
	}

}

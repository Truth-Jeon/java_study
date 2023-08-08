package java_study.chapter05;

public class ArrayEx9 {
	// 재조정하는 작업 : refactoring
	static int findMax(int[] data) {
		// 순차 검색 알고리즘 : 아주 기초적인 알고리즘임.
		int max = data[0];// 일단 맨 처음의 값을 받아서 넣는다.
		int maxIx = 0;
		for (int i = 1; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
				maxIx = i;
			}
		}
		return maxIx;
	}

	static int findMin(int[] data) {
		int min = data[0];
		int minIx = 0;
		for (int i = 1; i < data.length; i++) {
			if (min > data[i]) {
				min = data[i];
				minIx = i;
			}
		}
		return minIx;
	}

	public static void main(String[] args) {
		int[] jumsu = new int[5];

		ArrayUtil.getNumbers("숫자 입력 >>", jumsu);

		int maxIx = findMax(jumsu);
		int minIx = ArrayUtil.findMinValue(jumsu, 0, jumsu.length);
		System.out.println("가장 점수가 높은 번호는 " + (maxIx + 1) + "이며, 점수는 " + jumsu[maxIx] + "입니다.");
		System.out.println("가장 점수가 낮은 번호는 " + (minIx + 1) + "이며, 점수는 " + jumsu[minIx] + "입니다.");
	}

}

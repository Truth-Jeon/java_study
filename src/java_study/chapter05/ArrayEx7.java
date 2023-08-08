package java_study.chapter05;

public class ArrayEx7 {

	public static void main(String[] args) {
		int[] jumsu = new int[5];

		ArrayUtil.getNumbers("점수 >> ", jumsu); // call by reference

//		for (int x : jumsu) {
//			System.out.print(x + " ");
//		}
//		System.out.println();
		ArrayUtil.showNumbers(jumsu);

//		int sum = 0;
//		for (int x : jumsu) {
//			sum += x;
//		}
		int sum = ArrayUtil.addAll(jumsu);

		double avg = (double) sum / 5;

		System.out.printf("전체 합계 : %d\n", sum);
		System.out.printf("전체 평균 : %.1f\n", avg);
	}

	// 다른 패키지에서 이 함수를 사용하려면 public을 써야 함.
//	public static void getNumbers(String inputTitle, int[] data) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print(inputTitle);
//		for (int i = 0; i < data.length; i++) {
//			data[i] = sc.nextInt();
//		}
//	}
//
//	// 같은 패키지에 있으면 public을 붙이지 않아도 이 함수를 쓸 수 있음.
//	static void showNumbers(int[] data) {
//		for (int x : data) {
//			System.out.print(x + " ");
//		}
//		System.out.println();
//	}
//
//	static int addAll(int[] data) {
//		int sum = 0;
//		for (int x : data) {
//			sum += x;
//		}
//		return sum;
//	}
}

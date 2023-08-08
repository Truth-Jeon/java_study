package java_study.chapter05;

public class CallByReferenceEx {

	public static void main(String[] args) {
		// reference 타입
		int[] data = { 100, 200 };
		System.out.printf("변경 전 : %d, %d\n", data[0], data[1]);
//		System.out.println("A0 : " + System.identityHashCode(data[0]));
//		System.out.println("A1 : " + System.identityHashCode(data[1]));

		swap(data);
		System.out.printf("원본 변경 후 : %d, %d\n", data[0], data[1]);
//		System.out.println("B0 : " + System.identityHashCode(data[0]));
//		System.out.println("B1 : " + System.identityHashCode(data[1]));
	}

	// 배열의 첫번째, 두번째 엘리먼트 교환
	static void swap(int[] data) {
//		System.out.println("C0 : " + System.identityHashCode(data[0]));
//		System.out.println("C1 : " + System.identityHashCode(data[1]));
		int temp;
		temp = data[0];
		data[0] = data[1];
		data[1] = temp;

		System.out.printf("변경 후 : %d, %d\n", data[0], data[1]);
//		System.out.println("D0 : " + System.identityHashCode(data[0]));
//		System.out.println("D1 : " + System.identityHashCode(data[1]));
	}
}

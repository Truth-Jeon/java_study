package java_study.chapter05;

public class CallByValueEx {

	public static void main(String[] args) {
		// primitive 타입
		int x = 100;
		int y = 200;

		swap(x, y);
		System.out.printf("변경 전 - x: %d, y : %d\n", x, y);
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
	}

	static void swap(int x, int y) {
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.printf("변경 후 - x: %d, y : %d\n", x, y);
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
	}

}

package java_study.chapter11.sec06;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		char[] arr1 = { 'J', 'A', 'V', 'A' };

		// 현실에서는 배열을 잘 안쓰기 때문에 잘 쓸일이 없다고 함.

		// 방법 1, 2 : 복사본 배열이 새로 만들어져서 리턴됨. -> 이거.. 깊은 복사..?

		// 방법 1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2)); // 엘리먼트 출력

		// 방법 2
//		char[] arr3 = Arrays.copyOfRange(arr1, 0, 4); -> 이거 아닌가..?
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));

		// 방법 3: 기존 배열에 복사됨.
		// 방법3
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for (int i = 0; i < arr4.length; i++) {
			System.out.println("arr4[" + i + "]=" + arr4[i]);
		}
	}

}

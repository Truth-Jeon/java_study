package java_study.chapter05;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4 }; // new int[] 생략
		int[] arr2 = new int[] { 5, 6, 7, 8 }; // 정식 문법
		// arr={10,11,12}; // 이거는 당연히 안된다. 왜냐하면 타입선언도 없고, [] 배열인지 표시도 안해줬기 때문에 당연히 에러가
		// 남.
		arr = new int[] { 10, 11, 12 }; // 에러 아님.
	}

}

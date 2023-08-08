package java_study.chapter05;

public class ArrayEx10 {

	// 배열의 입력을 받아서 구성
	// 최소값을 찾아서 인덱스 0번과 값을 교환
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] data = new int[5];
//
//		// 데이터입력
//		ArrayUtil.getNumbers("숫자 입력>> ", data);

		// getRandomArray()를 써서...
		int data[] = ArrayUtil.getRandomArray(10, 100);

		for (int i = 0; i < data.length; i++) {
			int minIx = ArrayUtil.findMinValue(data, i, data.length);
			// 인덱스 i위치와 minIx의 값을 교환
			ArrayUtil.swap(data, i, minIx);
			ArrayUtil.showNumbers(data);
		}
//		ArrayUtil.showNumbers(data);
	}

}

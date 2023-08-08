package java_study.chapter05;

public class ArrayEx1 {
	public static void main(String[] args) {
		// double 배열 : height 123.4, 234.2, 124.5
		double[] height = { 123.4, 234.2, 124.5 };

		// double 배열 : 500개의 저장공간
		double[] space = new double[500];

		// char배열 gender '남', '여', '남'
		char[] gender = { '남', '여', '남' };

		// String배열 값을 모름. 333개의 저장공간.
		String[] space2 = new String[333]; // 0(null)으로 초기화

		System.out.println(space);
		System.out.println(space[0]);

		System.out.println(space2);
		System.out.println(space2[0]);
	}
}

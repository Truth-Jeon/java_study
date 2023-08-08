package java_study.chapter04;

public class PrintfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double value = 12.345678;
		String result = "작은 값";
		System.out.printf("계산 결과는 %f 입니다.\n", value);
		System.out.printf("계산 결과는 %.3f 입니다.\n", value);
		System.out.printf("%s의 값은 %.2f 입니다.", result, value);
	}

}

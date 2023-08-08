package java_study.chapter04;

public class BreakExample {

	public static void main(String[] args) throws Exception {
		while (true) {
			int num = (int) (Math.random() * 6) + 1; // Math.random() : 0~1 사이의 실수를 랜덤.
			System.out.println(num);
			if (num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}

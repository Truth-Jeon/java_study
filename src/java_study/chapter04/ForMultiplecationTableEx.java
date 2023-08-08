package java_study.chapter04;

public class ForMultiplecationTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
//				System.out.println(m + " X " + n + " = " + m * n);
				System.out.printf("%d X %d = %d\n", m, n, m * n);
			}
		}
	}

}

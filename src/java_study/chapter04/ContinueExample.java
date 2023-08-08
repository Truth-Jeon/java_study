package java_study.chapter04;

public class ContinueExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}

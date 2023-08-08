package java_study.chapter04;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
		long sum = 0;
		for (int i = 0; i < 100000; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("끝 " + sum);
	}

}

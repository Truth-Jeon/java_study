package java_study.chapter05;

public class StartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 점점 커지는 별의 수
		for (int i = 1; i <= 5; i++) {
			printStars('*', i);
		}
		// 점점 작아지는 별의 수
		for (int i = 5; i > 0; i--) {
			printStars('*', i);
		}

//		for (int i = 5; i > 0; i--) {
//			System.out.println("몇번?*");
//		}
	}

	static void printStars(char ch, int num) {
		for (int j = 0; j < num; j++) {
			System.out.print(ch);
		}
		System.out.println();
	}
}

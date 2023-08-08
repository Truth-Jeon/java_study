package java_study.chapter04;

import java.util.Scanner;

public class ConsoleTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.콘솔에서 입력
		// 4천개의 부품 중에서 콘솔에서 입력할 수 있는 기능을 가진 부품(class)을 램에 복사해서 사용.
		// 복사할때 입력하는 키워드 : new
		Scanner scanner = new Scanner(System.in); // 주로 copy and paste 할 때 쓰임.
		System.out.println("이름을 입력 >>");
		String name = scanner.next();// 단어 입력받는 기능
		// nextInt() 정로리턴, nextDouble() 실수로 리턴, nextLine() 다음 줄을 리턴
		// 단어의 구분은 "공백문자" -> 띄어쓰기 하면 안됨. -> 그럼 문자(space)로 리턴해줌.

		System.out.println("소속을 입력 >>");
		String company = scanner.next(); // next = 단어 입력받는 기

		System.out.println("나이 입력 >>");
		int age = scanner.nextInt();

		// 2. 처리

		// 3. 콘솔(모니터)에 출력
		System.out.println("당신의 이름은 " + name);
		System.out.println("당신의 소속은 " + company);
		System.out.println("당신의 나이는 " + age);
	}

}

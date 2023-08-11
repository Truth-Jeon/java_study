package java_study.chapter11.sec06;

import java.util.Scanner;

public class StartingWithQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력하세요:");
		String fileName = sc.nextLine();
		// 강사님 코드
		// String test = fileName.toLowerCase();
		// if(test.endsWith(".mp3")) { ~~~ } else { ~~~ }
		int comma = fileName.lastIndexOf('.');
		if (comma != -1) {
			String commaStr = fileName.substring(comma);
			System.out.println(commaStr);
		}
		sc.close(); // 원래는 정식으로는 close() 해줘야 함. 근데 지금은 안닫아도 큰 문제 없음.
	}

}

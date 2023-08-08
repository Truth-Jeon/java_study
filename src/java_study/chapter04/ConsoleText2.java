package java_study.chapter04;

import java.util.Scanner;

public class ConsoleText2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요일 입력: 주중1) 주말2) 공휴일3)");
		int data = sc.nextInt();
		if (data == 1) {
			System.out.println("열심히 공부합시다!!");
		} else if (data == 2) {
			System.out.println("열심히 놀아봅시다!!");
		} else {
			System.out.println("공휴일을 마음껏 즐기십시오!!");
		}
	}

}

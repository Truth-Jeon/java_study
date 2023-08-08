package java_study.chapter04;

import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {

	public static void main(String[] args) {
		// 상수 final : 마지막 대입이다, 더이상 못 바꾼다.
		final int SCISSORS = 1;
		final int ROCK = 2;
		final int PAPER = 3;
		// 이 상황에서는 계산 패턴이 안나옴.
		// final int ROCK = 0;
		// final int SCISSORS = 1;
		// final int PAPER = 2;

		// 가위 바위 보 게임 : 1회만 게임함.
		// 0: 가위, 1: 바위, 2: 보
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int pWin = 0; // 인간 승
		int cWin = 0; // 컴퓨터 승
		int draw = 0; // 비김

		while (true) {
			int computer = r.nextInt(3) + 1; // 3은 미포함, 0, 1, 2 중에서 랜덤하게 정함 -> 그러나 사용자와 맞추는게 좋기 때문에 1을 더함 -> 1,2,3

			System.out.println("가위, 바위, 보를 입력하세요.");
			System.out.print("1.가위, 2.바위, 3.보, -1.종료 >> ");
			int person = sc.nextInt();

			// 종료 조건 확인 후 진행
			if (person == -1) { // 종료 조건
				System.out.println("게임을 종료합니다.");
				System.out.printf("내가 이긴 횟수 : %d, 컴퓨터가 이긴 횟수 : %d, 비긴 횟수 : %d\n", pWin, cWin, draw);
				int sum = pWin + cWin;
				double result = (double) pWin / sum * 100;
				System.out.println("나의 승률 : " + (int) result + "%");
				// System.out.prinf("나의 승률 : %d%%", (int) result); 와 동일함.
				break;
			}

			System.out.printf("컴퓨터: %d, 당신: %d\n", computer, person);

			if (person == computer) { // 비긴 거
				draw += 1; // 또는 draw++;
				System.out.println("비겼습니다.");
			} else if ((person == SCISSORS && computer == PAPER) || (person == ROCK && computer == SCISSORS)
					|| (person == PAPER && computer == ROCK)) {
				// 내가 이긴 경우
				pWin += 1; // 또는 pWin++;
				System.out.println("이겼습니다.");
			} else { // 내가 진 경우
				cWin += 1; // 또는 cWin++;
				System.out.println("졌습니다.");
			}
		}
	}

}

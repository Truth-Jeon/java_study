package java_study.chapter04;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		boolean run = true;
		int speed = 0;
		int keyCode = 0;

		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("----------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("----------------");
				System.out.print("선택: ");
			}
			keyCode = System.in.read(); // 그냥 문자로 보고 리턴해줌.
			if (keyCode == 49) { // 1
				speed++;
				System.out.println("현재 속도=" + speed);
			} else if (keyCode == 50) { // 2
				speed--;
				System.out.println("현재 속도=" + speed);
			} else if (keyCode == 51) { // 3
				run = false; // 종료조건
			}
		}
	}

}

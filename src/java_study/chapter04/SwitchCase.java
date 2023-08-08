package java_study.chapter04;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "자바";

		// ctrl + shift + f : 자동 포맷팅
		switch (name) {
		case "자바":
//			System.out.println("1103호로 가세요.");
//			break;
		case "파이썬":
			System.out.println("1104호로 가세요.");
			break;
		// 자바 또는 파이썬 수이면 1104호로 가세요.
		case "OS":
		case "리눅스":
			System.out.println("1102호로 가세요.");
			break;
		// OS 또는 리눅스 수업이면 1102호로 가세요.
		default:
			System.out.println("카운터에 가서 문의하세요.");
			break;
		}
	}

}

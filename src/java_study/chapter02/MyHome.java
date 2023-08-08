package java_study.chapter02;

public class MyHome {
	// 파일이름은 대문자로 시작해서, 낙타표기법을 지켜주세요.
	// MyHome: 연결되는 단어의 첫글자는 대문자!!
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수명은 무조건 소문자로 시작!!
		// 연결되는 단어가 있으면 낙타표기
		int myAge = 100;
		String myTel = "011";
		String ssn = "880101";
		final String COMPANY = "메가더조은"; // 상수
		// COMPANY = "mega"; // 상수는 재할당 불가
		// final => 수정불가.
		// 메서드 내에서 선언되기 때문에 전부다 지역변수임.
		System.out.println("나의 나이는 " + 100 + "살 입니다.");
		System.out.println("줄을 바꾸고 싶어요. \n다음줄에 \"나와요.\"");
	}

}

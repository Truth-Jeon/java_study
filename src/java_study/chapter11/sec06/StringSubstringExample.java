package java_study.chapter11.sec06;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";

		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);

		String secondNum = ssn.substring(7);
		System.out.println(secondNum);

		// 하나의 예시임.파일명이 있는데 뭔지 모르는 상황..!
		// 파일의 확장명을 추출하세요.
		// 확장명의 글자 갯수가 3개라고 확정지으면 안됨. (3, 4, 5 글자일 수도 있음..)
		String fileName = "Hello.World.mp3";
		// 마지막에 위치한 '.'의 위치를 알아내면 됨.
		// lastIndexOf()를 사용한다.
		int ix = fileName.lastIndexOf('.');
		if (ix != -1) {
			String ext = fileName.substring(ix); // '.'을 제외하려면 ix+1을 매개변수로 넣어준다.
			System.out.println(ext);
		}
		// 확장명을 제외한 파일명만 추출하세요.
		int fileNameLength = fileName.length();
		int jum = fileName.lastIndexOf('.');
		if (jum != -1) {
			String str = new String();
			String jumjum = fileName.substring(0, jum);
			System.out.println(jumjum);
		}
	}

}

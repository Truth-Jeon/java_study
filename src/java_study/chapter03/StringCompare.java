package java_study.chapter03;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String str1 = "안녕하세요.";
		// String str2 = "안녕하세요.";
		// 이렇게 비교했을 때는 두 문자열 동등 이라는 결과가 나옴.
		String str1 = new String("안녕하세요."); // new라는 것은 해당 객체를 만들어달라는 뜻. String은 해당 객체의 타입.
		String str2 = new String("안녕하세요.");
		// 두 문자열 다름 이라는 결과가 나옴.

		System.out.println(str1);
		System.out.println(str2);

		if (str1 == str2) {
			System.out.println("두 문자열 동등");
		} else {
			System.out.println("두 문자열 다름");
		}

		// 위의 두개의 값이 왜 다른 결과가 나오는지에 대해서 알려면
		// "참조형 데이터" 에 대해서 알아야 함.
		// 만약에 두 객체의 주소값에 상관없이 내용이 동등한지를 알고싶다면 .equals()로 비교하면 값만 비교가 가능함.
		// if(str1.equals(str2)) 이렇게..!
	}

}

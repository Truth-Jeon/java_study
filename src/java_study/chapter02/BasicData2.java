package java_study.chapter02;

public class BasicData2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 => int
		byte age = 100; // -128~127
		short wallet = 2000; // -3만~3만
		int money = 5000000; // -21억~21억
		long space = 1000000000000L; // 21억 이상 //리터럴 : 데이터 타입 있습니다.
		System.out.println("내 은행에 든 돈: " + money + "원");

		double height = 185.5; // 거의 모든 소숫점
		float weight = 88.8f;
		System.out.println("내 키는 : " + height);

		// 문자 => 1글자
		char gender = '남'; // ''은 에러가 뜬다고 함. 작은따옴표 안에는 글자가 반드시 있어야 함. (물론 1글자만 가능)
		System.out.println("내 성별은 " + gender);

		// 기본데이터는 아닌데, 일상생활에서 문자들을 더 많이 사용하므로,
		// 이 부품을 기본 데이터로 쓸 수 있게 만들어 놓음.
		// char + char + char
		String name = "홍길동";
		System.out.println("내 이름은: " + name);
	}

}

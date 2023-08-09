package java_study.chapter10;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		// 예외 : try내에서 발생하는 에러를 말하는 것..!
		try {
			// try 블럭은 이미 에러가 났으므로 실행을 못한다.
			Class clazz = Class.forName("java.lang.String");
			System.out.println(clazz);
			return;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("클래스가 존재하지 않습니다.");
		} finally { // 예외 상관없이 항상 출력됨.
			// try 블럭에서 return이 된다고 해도 무조건 출력됨.
			System.out.println("====================");
		}
		System.out.println("프로그램 종료!!!");
	}
}

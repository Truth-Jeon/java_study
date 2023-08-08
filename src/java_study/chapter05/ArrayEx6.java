package java_study.chapter05;

// 참조형의 메모리 관리(운영)
public class ArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Hello"); // 지역변수 : 블럭 안에서 함수가 실행되면 시작, 끝나면 사라짐.

		str = new String("World");

		String str2 = new String("World");
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str2));
		str = str2;

		str = null;

		int a = 100;
		int b = 100;
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));

		String test1 = "hello";
		String test2 = "hello";
		System.out.println(System.identityHashCode(test1));
		System.out.println(System.identityHashCode(test2));
	}

}

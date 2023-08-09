package java_study.chapter08.sec05;

public class ChildExample {

	static void run(Parent p) {
		p.method2(); // override된 메서드는 실체의 메소드가 호출됨.
	}

	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child); // child
		run(child); // instance는 child이지만, parent로 받는다.(부모의 모양으로 보겠다.)

		Parent parent = child; // 자동 타입 변환
		System.out.println(parent); // child

		parent.method1();

		parent.method2(); // 재정의된 메소드가 호출됨.

		// parent.method3(); // 호출 불가

		child.method1();
		child.method2();
		child.method3();
	}

}

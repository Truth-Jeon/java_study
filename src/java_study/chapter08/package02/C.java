package java_study.chapter08.package02;

import java_study.chapter08.package01.A;

public class C {
	public void method() { // A와 상속관계도 아니고, 다른 패키지기 때문에 접근 불가
		A a = new A();
		a.field = "value";
		a.method();
	}
}

package java_study.chapter08.package02;

import java_study.chapter08.package01.A;

public class D extends A { // 다른 패키지에 있지만, 상속관계이기 때문에 접근 가능
	public D() {
		super();
		this.field = "value";
		this.method();
	}
}

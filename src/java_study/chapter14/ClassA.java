package java_study.chapter14;

import java.io.Serializable;

public class ClassA implements Serializable { // ClassB를 가지는 컨테이너 역할
	int field1;
	ClassB field2 = new ClassB(); // 또다른 객체
	static int field3;
	transient int field4;
}

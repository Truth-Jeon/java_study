package java_study.chapter08.polymorphism;

public abstract class Vehicle {
	public abstract void run(); // abstract 메소드 정의는 abstract 클래스에서만 정의내릴 수 있다.

	public void stop() {
		System.out.println("차량이 멈니다.");
	}
}

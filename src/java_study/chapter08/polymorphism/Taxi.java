package java_study.chapter08.polymorphism;

public class Taxi extends Vehicle {

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}

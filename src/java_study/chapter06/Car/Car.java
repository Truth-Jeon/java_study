package java_study.chapter06.Car;

public class Car {
	// String color; // 이번에 앞에 아무것도 안넣음.
	// access scope : 같은 패키지에 있는 class에서는 접근(사용) 가능.
	// 대신, 다른 패키지에서는 사용 불가.

	public String color; // 앞에 public 을 붙여야지만 다른 클래스에서 접근 가능.

	public void run() {
		System.out.println("부릉부릉 달리다!!");
	}

	public void up() {
		System.out.println("비싼 휘발유를 먹으러!! 미친듯이 속도 UP.");
	}
}

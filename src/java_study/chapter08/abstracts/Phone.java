package java_study.chapter08.abstracts;

public abstract class Phone { // abstract : 부모 클래스로서의 의미만 있음.
	// New로 값을 초기화 하지 못함.
	// 타입으로 참조의 의미만 있음.
	// 필드
	public String owner;

	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}

	// 메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}

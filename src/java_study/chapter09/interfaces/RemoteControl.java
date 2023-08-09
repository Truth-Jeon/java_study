package java_study.chapter09.interfaces;

public interface RemoteControl {
//여기에 뭘 넣을 수 있을까?
	// 과거에는 (v.8 이전) 추상메서드만 넣을 수 있었음.
	// 그러나 v.8 이후에는 상수를 넣을 수 있게 변경됐다.
	// 그리고 이미 인터페이스가 '추상'의 의미를 갖고 있기 때문에, abstract를 붙이지 않아도 됨.
	// 그리고 인터페이스는 대화가 목적이기 때문에, public을 붙이지 않아도 자동으로 public이 됨.
	// 즉 자동으로 public abstract void 메서드명() { ... }이 되는 것이다.
	// static, default도 넣을 수 있다.
	// 추상 : static final 임. -> 많은 사람들 앞에서 틀렸음.. -_- 절대 잊지 말자..
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	void turnOn();

	void turnOff();

	void setVolume(int volume);

	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}

	// 정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}

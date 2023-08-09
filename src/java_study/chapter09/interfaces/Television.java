package java_study.chapter09.interfaces;

public class Television implements RemoteControl {
	// 필드
	private int volume;

	// turnOn() 추상 메소드의 실제 메소드
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	// turnOff() 추상메소드의 실체 메소
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를  끕니다.");
	}

	// setVolume() 추상 메소드의 실체 메소드
	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + volume);
	}
}

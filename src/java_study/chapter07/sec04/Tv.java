package java_study.chapter07.sec04;

public class Tv {
	private int channel; // 멤버변수, 전역변수, 자동초기
	private int volume; // 메소드 영역
	private boolean onOff;
	private final int serial; // 1 증가된 값을 //인스턴스 상수. (인스턴스로 값을 한번 초기화 한 뒤 바꿀 수 없음.)
	static final double PI = 3.14; // 굳이 instance로 만들 필요 없음. 값이 존재하기만 하면 됨.
	// 어떻게 보면 이게 진짜 상수의 의미를 가진 것임.

	static int count = 0; // static은 명시적으로 초기값을 주는 것이 관례임.

	public Tv() {
		super();
		count++;
		serial = count; // 마치 은행의 번호표 역할
	}

	public Tv(int channel, int volume, boolean onOff) {
		super();
		count++;
		serial = count;
		this.channel = channel;
		this.volume = volume;
		this.onOff = onOff;
	}

	public int getSerial() {
		return serial;
	}

//	public void setSerial(int serial) {
//		this.serial = serial;
//	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isOnOff() {
		return onOff;
	}

	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}

	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volume=" + volume + ", onOff=" + onOff + "]";
	}
}

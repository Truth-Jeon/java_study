package java_study.chapter07.sec04;

public class Tv {
	private int channel; // 멤버변수, 전역변수, 자동초기
	private int volume; // 메소드 영역
	private boolean onOff;

	public Tv() {
		super();
	}

	public Tv(int channel, int volume, boolean onOff) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.onOff = onOff;
	}

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

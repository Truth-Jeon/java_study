package java_study.chapter09.implementations;

import java_study.chapter09.interfaces.RemoteControl;

//현재 과정은 SOLID 법칙 중에서 I에 해당하는 인터페이스 분리과정이다.
// SmartTelevision, RemoteControl, Searchable 모두 인스턴스 초기화가 가능하다.
//대신, 각각의 타입에 대해서 사용할 수 있는 메소드는 제한이 있다.
//스마트 텔레비젼 - 제한 없음, 오브젝트 - 이꼴, 투스트링, 리모트컨트롤 - 리모트컨트롤에 있는 메소드, 변수만, 서쳐블 - 서쳐블에 있는 메소드, 변수만
public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + volume);
	}

	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

}

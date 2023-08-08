package java_study.chapter08.sec01;

public class DmbCellPhone extends CellPhone { // extends CellPhone : 확장
	int channel;

	public DmbCellPhone(String model, String color, int channel) {
		super(model, color); // <- 원래는 적어야 하는게 필수지만, 안적어도 자동으로 추가해줌.
		// super는 부모의 기본생성자를 호출해준다는 의미임.
		// super() 안에 부모 클래스에서 상속받은 변수를 넣지 않으면 에러가 남. (기본생성자를 넣어주지 않았기 때문에.)
//		this.model = model; // 상속 속성
//		this.color = color; // 상속 속성
		this.channel = channel; // 추가 속성
	}

//	public DmbCellPhone(int channel) {
//		super();
//		this.channel = channel;
//	}

	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}

//	public DmbCellPhone(String model, String color, int channel) {
//		super(model, color);
//		this.channel = channel;
//	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}

	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}

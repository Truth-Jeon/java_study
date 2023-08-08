package java_study.chapter06.TV;

public class Tv {
	// 멤버 변수
	public int size;
	public int price;
	public String manuCompany;
	public String purchasePlace;

	// 멤버 메서드
	public void turnOn(String manuCompany) {
		System.out.println(manuCompany + " 티비를 켭니다.");
	}

	public void turnOff(String manuCompany) {
		System.out.println(manuCompany + " 티비를 끕니다.");
	}

	public void changeChannel() {
		System.out.println("채널을 바꿉니다.");
	}
}

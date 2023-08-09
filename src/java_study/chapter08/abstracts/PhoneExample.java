package java_study.chapter08.abstracts;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone(); (x)
		SmartPhone smartPhone = new SmartPhone("홍길동");

		smartPhone.turnOn();// Phone의 메서드
		smartPhone.internetSearch();
		smartPhone.turnOff();// Phone의 메서드

		Phone phone = new SmartPhone("홍길동");

		phone.turnOn();// Phone의 메서드
		((SmartPhone) phone).internetSearch();
		phone.turnOff();// Phone의 메서드

	}
}

package java_study.chapter06.Account;

public class Account {
	String name;
	String accountName;
	private int balance; // 잔액
	// private : 클래스 안에서만 핸들링 하겠다. 전역변수의 단점을 막을 수 있음.
	// 접근 제어자. (public, protected, default, private)

	public void deposit(int amount) { // amount : 입금액
		balance += amount;
		System.out.println(name + " 이/가 " + accountName + "에서 " + amount + "원을 입금하다.");
//		System.out.println(name + " 잔액 : " + balance);
	}

	public void withDraw(int amount) {
		if (balance > amount) {
			balance -= amount;
			System.out.println(name + " 이/가 " + accountName + "에서 " + amount + "에서 출금하다.");
		} else {
			System.out.println(name + "님 잔액이 부족합니다.");
		}
//		System.out.println(name + " 잔액 : " + balance);
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", accountName=" + accountName + ", balance=" + balance + "]";
	}
}

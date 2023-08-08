package java_study.chapter07.sec01;

public class Account {
	private String name;
	private String accountName;
	private int balance; // 잔액

	public Account() { // 변수를 0으로 초기화.

	}

	public Account(String n, String an, int b) { // 매개변수로 전달된 값으로 초기화.
		// 비권장 명명임. (n, an, b 처럼 변수명의 의미를 알 수 없을 때.)
		name = n;
		accountName = an;
		balance = b;
	}

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

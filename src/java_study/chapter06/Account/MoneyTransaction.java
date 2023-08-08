package java_study.chapter06.Account;

public class MoneyTransaction {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.name = "고진규";
		account1.accountName = "카카오뱅크";
//		account1.balance = 100000;

		Account account2 = new Account();
		account2.name = "전하윤";
		account2.accountName = "신한은행";
//		account2.balance = 200000;
//		account2.balance -= 200000; // => 이렇게 직접 값을 변경하면 안됨.
		// 전역변수의 단점, 버그의 온상
		// 전역변수에 private를 넣으면 이런 현상을 막을 수 있다.
		// private = 클래스 안에서만 핸들링 하겠다. 클래스 바깥에서는(인스턴스에서는) 핸들링 할 수 없다.

//		account1.deposit(5000);
//		account2.withDraw(30000);
//		account2.deposit(50000);
//		account1.withDraw(10000);

		account2.withDraw(150000);
		account1.withDraw(150000);

		System.out.println(account1);
		System.out.println(account2);
	}

}

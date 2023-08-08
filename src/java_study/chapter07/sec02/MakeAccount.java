package java_study.chapter07.sec02;

public class MakeAccount {

	public static void main(String[] args) {
		Account account = new Account("전하윤", "960601", 1000000);
		Account account2 = new Account("임하윤", "960701", 500000);

		// 현재 잔액만 출력
		System.out.println(account2.getMoney());
		account2.setMoney(1000000);
		System.out.println(account2.getMoney());
		System.out.println(account);
//		System.out.println(account.toString());
		System.out.println(account2);
//		System.out.println(account2.toString());
	}

}

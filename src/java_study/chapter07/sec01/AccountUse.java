package java_study.chapter07.sec01;

public class AccountUse {

	public static void main(String[] args) {
		Account a1 = new Account(); // 기본생성자
		System.out.println(a1);

		Account a2 = new Account("홍길동", "카카오뱅크", 100000);
		System.out.println(a2);
	}

}

package java_study.chapter07.sec02;

public class Account {
	private String name;
	private String ssn;
	private int money; // 잔액

	// 생성자, 멤버변수값 처음 넣어줄 때 사용(멤버변수 초기화)
//	public Account(String name, String ssn, int money) { // 매개변수로 전달된 값으로 초기화.
//		this.name = name;
//		this.ssn = ssn; // 지역변수가 멤버변수보다 우선순위가 더 높음.
//		// 그래서 변수 이름이 같을때 this.를 앞에 써주지 않으면 둘다 멤버변수로 인식함.
//		// this.를 써야할 때 = 지역변수와 멤버변수의 이름이 같을때!
//		this.money = money;
//	}

	// 오버로딩 기능
	public Account() { // 사용 안하더라도 항상 정의(만들어 놓는게)하는게 관례임.

	}

	public Account(String name, String ssn, int money) {
		super(); // 현재는 있어도, 없어도 그만.
		// 상속과 관련된 것임.
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}

	public Account(String name, String ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 일반 메서드 정의
	// ...
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
//		return this.money = money;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
	}

}

package java_study.chapter08.sec02;

public class People {
	public String name;
	public String ssn;

	// 상속 타입을 private 으로 바꾸면 상속은 됐지만, 자식에서 접근은 불가능하다.
//	private String name;
//	private String ssn;

	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}

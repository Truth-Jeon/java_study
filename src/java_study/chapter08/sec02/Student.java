package java_study.chapter08.sec02;

public class Student extends People {
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
		this.name = name;// 부모 클래스 변수가 private면 에러남.
		this.ssn = ssn;// 부모 클래스 변수가 private면 에러남.
	}

}

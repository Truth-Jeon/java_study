package java_study.chapter08.sec03;

public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}

	@Override
	public String toString() {
		return "Computer..." + super.toString();
		// 부모 키워드를 사용할 때 "super"를 앞에 붙여주면 됨.
	}

}
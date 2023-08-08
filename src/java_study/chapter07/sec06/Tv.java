package java_study.chapter07.sec06;

public class Tv {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;

	static {
		// static 메서드 내에서는 static 변수만 사용 가능하다.
		// this로 접근을 못하기 때문에.
		info = company + " - " + model;
	}
}

package java_study.chapter08.sec03;

public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;

		Calculator calculator = new Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();

		Computer computer = new Computer();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println(calculator); // calculator.toString() 호출
		System.out.println(computer); // computer.toString() 호출
	}
}

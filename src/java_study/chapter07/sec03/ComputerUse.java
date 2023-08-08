package java_study.chapter07.sec03;

public class ComputerUse {

	public static void main(String[] args) {
		Computer com1 = new Computer(2000000, "LG", 15); // 하드코딩
		Computer com2 = new Computer(3000000, "삼성", 15); // 하드코딩

		System.out.println(com1); // c1.toString() 호출
		System.out.println(com2); // c2.toString() 호출

		// 이렇게 값을 대입하는게 더 많이 쓰임. (하드코딩이 아님.)
		Computer com3 = new Computer();
		com3.setPrice(3600000);
		com3.setManufacture("Apple");
		com3.setMonitorSize(15);

		System.out.println(com3);
	}

}

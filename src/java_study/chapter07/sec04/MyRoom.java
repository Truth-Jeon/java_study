package java_study.chapter07.sec04;

public class MyRoom {

	public static void main(String[] args) {
		Tv myTv = new Tv();
		Tv yourTv = new Tv();

		myTv.setOnOff(true);
		myTv.setChannel(5);
		myTv.setVolume(10);

		yourTv.setOnOff(true);
		yourTv.setChannel(15);
		yourTv.setVolume(20);

		System.out.println(myTv);
		System.out.println(yourTv);

		// 배열 선언 (타입은 당연히 Tv여야 함. -> 왜냐하면 Tv클래스의 값을 넣어줄 것이므로. 타입도 당연히 Tv임.)
		Tv[] allTv = new Tv[100];

		// 이 루프는 지금은 큰 의미가 없음. -> 스태틱 변수를 확인하기 위함인데, 지금 안배운 주제이기 때문에 나중에.. 의미가 있다.
		for (int i = 0; i < 100; i++) {
			// 아래의 2줄은 위와 같음.
			// allTv[i] = new Tv(1,1,true);
			Tv tv = new Tv(1, 1, true);
			allTv[i] = tv;

//			System.out.println(allTv[i]);
		}

		System.out.println(myTv.getChannel());
		System.out.println(yourTv.getChannel());
		System.out.println("allTv 0번째 배열의 값 : " + allTv[0]);
		System.out.println("allTv 배열의 크기 = " + allTv.length);

		// 데이터형과 참조형의 배열은 직접적으로 값을 집어넣는 방법까지 똑같다.
		int[] numbers = { 1, 2, 3 };
		// 하지만 참조형은 참조값을 불러와서 직접적으로 넣어줘야 함.
		Tv[] tvArrs = { new Tv(10, 10, false), new Tv(20, 20, false), new Tv(30, 30, false), new Tv(40, 40, false),
				new Tv(50, 50, false), };
	}
}

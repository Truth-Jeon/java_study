package java_study.chapter06.TV;

public class MyRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv1 = new Tv();
		tv1.size = 20;
		tv1.price = 5000000;
		tv1.manuCompany = "삼성";
		tv1.purchasePlace = "삼성 가전제품 판매점";
		tv1.turnOn(tv1.manuCompany);
		tv1.turnOff(tv1.manuCompany);
		tv1.changeChannel();
		System.out.println(tv1);

		Tv tv2 = new Tv();
		tv2.size = 20;
		tv2.price = 4000000;
		tv2.manuCompany = "LG";
		tv2.purchasePlace = "LG 가전제품 판매점";
		tv2.turnOn(tv2.manuCompany);
		tv2.turnOff(tv2.manuCompany);
		tv2.changeChannel();
		System.out.println(tv2);
	}

}

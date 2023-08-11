package java_study.chapter11.generics;

public class ProductExample {

	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		// Product<Tv, String> product1 = new Product<>(); 이렇게 해도 됨.
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();

		Product<Car, String> product2 = new Product<Car, String>();
		// Product<Car, String> product2 = new Product<>(); 이렇게 해도 됨.
		product2.setKind(new Car());
		product2.setModel("스마트Tv");
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}

}

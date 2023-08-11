package java_study.chapter11.sec09;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("hello");
		String str = box1.get();

		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);
		int value = box2.get();

//		Box<int> box3; //Reference 타입을 써야한다고 에러가 뜸. Primitive 타입은 안됨.
	}

}

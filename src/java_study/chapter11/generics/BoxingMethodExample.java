package java_study.chapter11.generics;

public class BoxingMethodExample {

	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();

		Box<String> box2 = Util.boxing("홍길동");
		String strValue = box2.get();
	}

}

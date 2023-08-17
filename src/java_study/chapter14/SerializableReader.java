package java_study.chapter14;

public class SerializableReader {

	public static void main(String[] args) { // 예외는 호출하는 쪽에서 해줘야 함.
		ClassA v;
		try {
			v = (ClassA) Serializer.load("/Users/jeonhayoon/temp/object2x.dat"); // Object --> ClassA 변환 : Down Casting
			System.out.println("field1: " + v.field1);
			System.out.println("field2.field1: " + v.field2.field1);
			System.out.println("field3: " + v.field3);
			System.out.println("field4: " + v.field4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package java_study.chapter10;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {
//		System.out.println(args);
//		System.out.println(args.length);
//		System.out.println(args[0]);
//		System.out.println(args[1]);
////		System.out.println(args[2]);
//
//		int value = Integer.parseInt(args[0]);
//		int value = Integer.parseInt(args[1]);
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("실행 매개값의 수가 부족합니다.");
//			System.out.println("[실행 방법]");
//			System.out.println("java CatchByExceptionKindExample	num1	num2");
			System.err.println("매개변수 부족");// err로 출력하면 버퍼링때문에 언제 나올지 장담 못함.
//		} catch (NumberFormatException e) {
//			System.err.println("숫자로 변환할 수 없습니다."); // err로 출력하면 버퍼링때문에 언제 나올지 장담 못함.
//			// out의 버퍼와 err의 버퍼가 다르기 때문에 err은 순서대로 안나올수도 있음.
//			// err로 처리하면 finally 다음에 나올수도 있고, 전에 나올수도 있음.
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		} finally {
			System.out.println("다시 실행하세요. ");
		}

	}
}

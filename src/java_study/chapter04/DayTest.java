package java_study.chapter04;

import java.util.Date;

public class DayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int month = date.getMonth() + 1;
		int day = date.getDay();
		System.out.println(day);
		switch (day) {
		case 0:
			case6: // 주
			System.out.println("자바공부하러 가");
			break;
		default:
			break;
		}
	}

}

package java_study.chapter04;

import java.util.Date;

public class SeasonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int month = date.getMonth();
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
			break;
		}
	}

}

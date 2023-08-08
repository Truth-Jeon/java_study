package java_study.chapter04;

import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();

		int year = date.getYear();
		int month = date.getMonth();
		int today = date.getDate();
		System.out.println(year + 1900 + "년 " + month + "월 " + today + "일");

		// 2023-08-01 11:20:30
		System.out.printf("%4d-%02d-%02d %02d:%02d:%02d\n", year + 1900, month, today, hour, min, sec);
	}

}

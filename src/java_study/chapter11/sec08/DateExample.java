package java_study.chapter11.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);

		// 24시간 표기는 HH, 12시간 표기는 hh
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd  a hh:mm:ss"); // a는 오전, 오후를 표시함.
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}

}

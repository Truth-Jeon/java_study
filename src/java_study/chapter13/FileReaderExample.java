package java_study.chapter13;

import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("/Users/jeonhayoon/temp/test.txt");

		int readCharNo;
		char[] cbuf = new char[100];
		while ((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
//			System.out.print(data); // 일반 데이터(문자열)를 출력
			System.out.print(cbuf); // 문자 배열을 출력
		}
		fr.close();
	}

}

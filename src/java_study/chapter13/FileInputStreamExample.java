package java_study.chapter13;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
//		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream("/Users/jeonhayoon/temp/test.txt");
//			int data;
//			while ((data = fis.read()) != -1) { // 1byte씩 읽고 콘솔에 출력
//				System.out.write(data);
//			}
//		} catch (Exception e) {
		try (FileInputStream fis = new FileInputStream("/Users/jeonhayoon/temp/test.txt");) {
			int data;
			while ((data = fis.read()) != -1) { // 1byte씩 읽고 콘솔에 출력
				System.out.write(data); // 한 바이트씩 읽고 출력
//				System.out.println(data); // => 문자 출력용. 이렇게 출력하면 아스키코드가 나옴.
//				System.out.println((char) data); // => 영어는 제대로 나오지만, 한글은 깨짐.
//				System.out.print((char) data); // 한글자씩 개행되진 않지만 여전히 한글은 깨짐
			}
			System.out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		} finally {
//			try {
//				System.out.println("파일닫기");
//				if (fis != null) {
//					fis.close();
//				}
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}

}

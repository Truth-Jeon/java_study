package java_study.chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample { // 첨부파일 업로드, 다운로드 시 이 코드가 쓰임.

	public static void main(String[] args) throws IOException {
		String originalFileName = "/Users/jeonhayoon/temp/house.jpeg";
		String targetFileName = "/Users/jeonhayoon/temp/house_copy.jpeg";

		try (FileInputStream fis = new FileInputStream(originalFileName);
				FileOutputStream fos = new FileOutputStream(targetFileName);
		// 이미 기존파일이 작업중일 경우에는 생성이 안됨. (운영체제에서 lock을 걺)
		// 뒤에 true를 붙이면 기존 데이터를 살리고 하나 더 생성됨.
//				FileOutputStream fos = new FileOutputStream(targetFileName, true);
		) {
			int readByteNo;
			byte[] readBytes = new byte[100];
			while ((readByteNo = fis.read(readBytes)) != -1) {
				// 공간이 부족할때 error가 남.
				fos.write(readBytes, 0, readByteNo);
				// fos.write(readBytes); 만 하면 안되는 이유 : 값이 들어간 부분만 데이터가 채워지고 나머지는 쓰레기 값이 되기 때문
			}
			fos.flush();
			System.out.println("복사완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

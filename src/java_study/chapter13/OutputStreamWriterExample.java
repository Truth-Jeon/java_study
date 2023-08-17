package java_study.chapter13;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("/Users/jeonhayoon/temp/file.txt");
				Writer writer = new OutputStreamWriter(fos);) {
			String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환";
			writer.write(data);
			writer.flush();
			System.out.println("파일 저장이 끝났습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package java_study.chapter13;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {

	public static void main(String[] args) {
		InputStream is = System.in;
//		Reader reader = new InputStreamReader(is);
		try (Reader reader = new InputStreamReader(is);) {
			int readCharNo;
			char[] cbuf = new char[100];

			while ((readCharNo = reader.read(cbuf)) != -1) {
				String data = new String(cbuf, 0, readCharNo);
				System.out.println(data);
			}

			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

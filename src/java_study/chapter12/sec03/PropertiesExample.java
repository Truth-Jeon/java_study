package java_study.chapter12.sec03;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		// 상대경로
		// PropertiesExample 클래스 파일을 기준으로 찾는 것임.
		// getResource()는 작성된 클래스 파일을 기준으로 찾는 메서드임.
		// 상대경로로 파일을 찾으면 복잡하니, 절대경로로 파일을 찾을 수 있게 해준다.
		// -> 이런식으로 : /database.properties
		String path = PropertiesExample.class.getResource("/database.properties").getPath();
		System.out.println(path);

		path = URLDecoder.decode(path, "utf-8"); // 예외처리가 반드시 필요함
		properties.load(new FileReader(path));// 예외처리가 반드시 필요

		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
	}

}

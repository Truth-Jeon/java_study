package java_study.chapter15.echo01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample {
//우리가 클라이언트에서 먼저 전송 후 서버가 응답하는 코드로 직접 설정함.
	// 누가 먼저 전송하느냐의 순서는 개발자가 정하는 것. 정해져있는게 없음.
	public static void main(String[] args) {
		try (Socket socket = new Socket("127.0.0.1", 10000)) {
			InputStream in = socket.getInputStream(); // 수신(입력) 스트림
			OutputStream out = socket.getOutputStream(); // 전송(출력) 스트림

			String str = "Hello, Server";
			out.write(str.getBytes()); // 메세지 전송
			out.flush();
			System.out.println("메세지 전송: " + str);

			byte arr[] = new byte[100]; // 수신 버퍼
//			in.read(arr); // 메세지 수신
			int size = in.read(arr); // 메세지 수신
			System.out.print("메세지 수신: ");
//			System.out.println(new String(arr));
			System.out.println(new String(arr, 0, size));

			System.out.println("서버연결성공");
		} catch (Exception e) {
			System.out.println(e.getMessage()); // 방화벽 때문에 연결이 안될 수 있으니 주의.
		}
	}

}

package java_study.chapter15.echo02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientExample {
//우리가 클라이언트에서 먼저 전송 후 서버가 응답하는 코드로 직접 설정함.
	// 누가 먼저 전송하느냐의 순서는 개발자가 정하는 것. 정해져있는게 없음.
	public static void main(String[] args) {
		try (Socket socket = new Socket("127.0.0.1", 10000)) {
			System.out.println("서버연결성공");

			// 수신용 Reader 만들기 => 문자열 기반 서버에서 BufferedReader()는 필수이다.
			BufferedReader r = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// 전송용 Writer 만들기
			PrintWriter w = new PrintWriter(socket.getOutputStream());

			Scanner s = new Scanner(System.in);
			System.out.print("문자열 입력> ");
			String line = s.nextLine(); // 전송할 문자열 입력 => BufferedReader + nextLine()

			// 메세지 전송
			w.println(line); // line + \n -> 개행문자가 들어있으므로 readLine()이 사용 가능하다.
			w.flush();

			// 메세지 수신
			String receiveLine = r.readLine(); // \n 까지 읽어서 리턴
			System.out.println("수신 메세지 : " + receiveLine);
			System.out.println("통신 종료");
		} catch (Exception e) {
//			System.out.println(e.getMessage()); // 방화벽 때문에 연결이 안될 수 있으니 주의.
			e.printStackTrace();
		}
	}

}

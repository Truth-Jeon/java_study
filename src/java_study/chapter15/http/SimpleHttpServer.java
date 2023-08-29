package java_study.chapter15.http;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleHttpServer {
	public static void main(String[] args) {
		// 서버소켓 생성
		try (ServerSocket serverSocket = new ServerSocket(80);) {
			System.out.println("서버 기동됨");
			System.out.println("클라이언트 접속 대기 중");

			// 루프 돌려야 할 곳 (시작)
			while (true) {
				Socket socket = serverSocket.accept(); // 접속 대기
				System.out.println("클라이언트 접속 성공");

				BufferedReader r = new BufferedReader(new InputStreamReader(socket.getInputStream()));

				// 1. 요청라인
				String line = r.readLine();
				System.out.println(line);
				String[] url = line.split(" ");
				System.out.println("요청한 파일: " + url[1]);

				// 2. 요청헤더(key:value)
				while (true) {
					line = r.readLine();
					if (line.equals("")) {
						break;
					}
					System.out.println(line);
				}

				// 3. BODY - GET 요청일때는 없음

				// 응답을 내보냄.
				PrintWriter w = new PrintWriter(socket.getOutputStream());
				// 1. 응답 라인
				w.println("HTTP/1.1 200 OK");

				// 2. 헤더
				w.println("Content-type: text/html");
				w.println(); // 헤더의 끝

				// 3. body 부분
				w.println("<html>");
				w.println("<body><h1>Hello</h1></body>");
				w.println("</html>");
				w.flush();
				socket.close();

//				// 실제 통신은 스레드로 위임
//				Thread t = new WorkThread(socket);
//				t.start();
			}
			// 루프 돌려야 할 곳 (끝)
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

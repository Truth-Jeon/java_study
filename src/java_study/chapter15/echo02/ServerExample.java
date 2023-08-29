package java_study.chapter15.echo02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

	public static void main(String[] args) {
		Socket socket = null;
		// 서버소켓 생성
		try (ServerSocket serverSocket = new ServerSocket(10000);) {
			System.out.println("서버 기동됨");
			System.out.println("클라이언트 접속 대기 중");

			socket = serverSocket.accept(); // 접속 대기

			System.out.println("클라이언트 접속 성공");

			// 수신용 Reader 만들기
			BufferedReader r = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// 전송용 Writer 만들기
			PrintWriter w = new PrintWriter(socket.getOutputStream());

			String line = r.readLine();
			System.out.println("서버 수신 메세지 : " + line);

			// 메세지 전송
			w.println(line);
			w.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (Exception e) {
			}
		}
	}

}

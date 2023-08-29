package java_study.chapter15.echo04;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

	public static void main(String[] args) {
		// 서버소켓 생성
		try (ServerSocket serverSocket = new ServerSocket(10000);) {
			System.out.println("서버 기동됨");
			System.out.println("클라이언트 접속 대기 중");

			// 루프 돌려야 할 곳 (시작)
			while (true) {
				Socket socket = serverSocket.accept(); // 접속 대기
				System.out.println("클라이언트 접속 성공");

				// 실제 통신은 스레드로 위임
				Thread t = new WorkThread(socket);
				t.start();
			}
			// 루프 돌려야 할 곳 (끝)
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

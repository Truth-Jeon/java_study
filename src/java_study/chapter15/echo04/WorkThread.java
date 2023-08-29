package java_study.chapter15.echo04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class WorkThread extends Thread {
	Socket socket;

	public WorkThread(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		// 스레드의 작업 정의
		try {
			// 수신용 Reader 만들기
			BufferedReader r = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 전송용 Writer 만들기
			PrintWriter w = new PrintWriter(socket.getOutputStream());

			// 메세지 수신
			String line = r.readLine();
			System.out.println("서버 수신 메세지 : " + line);

			// 메세지 전송
			w.println(line);
			w.flush();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

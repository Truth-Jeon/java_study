package java_study.chapter03;

import javax.swing.JOptionPane;

public class StringCompare2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String signup_id = "root";
		String signup_pw = "pass";

		String signin_id = JOptionPane.showInputDialog("아이디 입력");
		String signin_pw = JOptionPane.showInputDialog("패스워드 입력");

		if (signup_id.equals(signin_id) && signup_pw.equals(signin_pw)) {
			System.out.println("로그인 ok");
		} else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
		}
	}

}

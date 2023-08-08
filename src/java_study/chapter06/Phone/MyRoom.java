package java_study.chapter06.Phone;

public class MyRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1 = new Phone();
		p1.doInternet();
		p1.color = "검정";
		p1.shape = "폴더블";

		Phone p2 = new Phone();
		p2.doInternet();
		p2.color = "스페이스 그레이";
		p2.shape = "노트";

		System.out.println(p2.color);
		System.out.println(p2.shape);
	}

}

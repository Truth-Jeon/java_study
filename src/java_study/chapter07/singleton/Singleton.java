package java_study.chapter07.singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();
	// 자동초기화
	// 이때 딱 1번 생성이 됨.
	// private도 중요함.
	// 왜냐하면 외부에서 Singleton.singleton = null; 로 없애버릴 수 있기 때문에.
	// 결론적으로 외부에서 생성 및 소멸을 막기 위해서 만들어진 패턴임.

	private Singleton() {

	}

	public static Singleton getInstance() {
		return singleton;
	}

	private String dbname = "bbs 데이터베이스";

	public void open() {
		System.out.println(dbname + " 열기");
	}

	public void close() {
		System.out.println(dbname + " 닫기");
	}

	public void read() {
		System.out.println(dbname + " 읽기");
	}
}

package java_study.chapter11.sec04;

public class SystemEnvExample {
	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("[ JAVA_HOME ] " + javaHome);
	}
}

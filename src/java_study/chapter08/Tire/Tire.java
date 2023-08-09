package java_study.chapter08.Tire;

public class Tire {
	public int maxRotation; // 최대 회전수(최대 수명)
	public int accumulatedRotation; // 누적 회전수
	public String location; // 타이어의 위치

	public Tire(String location, int maxRotation) { // 필드 초기화
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		++accumulatedRotation; // 누적 회전수 1증가
		if (accumulatedRotation < maxRotation) { // 누적 < 최대 일 경
			System.out.println(location + " Tire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else { // 누적 <= 최대 일 경우
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}

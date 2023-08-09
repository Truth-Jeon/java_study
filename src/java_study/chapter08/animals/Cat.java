package java_study.chapter08.animals;

public class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() { // 추상 메서드 재정의
		// TODO Auto-generated method stub
		System.out.println("야옹");
	}

}

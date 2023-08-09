package java_study.chapter08.animals;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound(); // 출력 가능
		cat.sound(); // 출력 가능
		System.out.println("------");

		// 변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound(); // 출력 가능
		animal = new Cat();
		animal.sound(); // 출력 가능
		System.out.println("------");

		// 매개변수의 자동 타입 변환
		animalSound(new Dog()); // 출력 가능
		animalSound(new Cat()); // 출력 가능
	}

	private static void animalSound(Animal animal) {
		animal.sound();
	}

}

package java_study.chapter11.sec07;

public class Member implements Comparable<Member> {
	String name;
	int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Member o) { // 파라미터(매개변수) = 우리가 정의한 name
//		return name.compareTo(o.name); // 비교할 것을 정의함 : name
		// - 를 붙이면 반대로 나옴 (내림차순)
		return age - o.age; // 비교할 것을 정의함 : age
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
//		return "Member [name=" + name + "]";
	}

}

package java_study.chapter11.sec01;

//VO (Value Object)

public class Member {
	public String id;
	public int age; // primitive 타입이라서 equals() 로는 확인 불가함.
	// primitive 타입은 객체가 아니므로 메서드가 없다.

	@Override
	public boolean equals(Object obj) { // 매개변수가 Object(최상위 클래스) = 모든 메서드가 올 수 있다는 뜻.
		if (obj instanceof Member) { // 매개값이 Member인지 확인
			Member member = (Member) obj; // 타입 변환 후 //DownCasting // obj.member를 하면 오류남.
			if (id.equals(member.id) && age == member.age) { // id 필드 동일 여부 확인
				return true;
			}
		}
		return false;
	}

	public Member(String id, int age) {
		super();
		this.id = id;
		this.age = age;
	}
}

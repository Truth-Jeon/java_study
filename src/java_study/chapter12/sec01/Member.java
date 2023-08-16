package java_study.chapter12.sec01;

import java.util.Objects;

//Lombok을 사용하면 @hashCode, @equals를 사용할 수 있음.

public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

//	public boolean equals(Object obj) {
//		if (obj instanceof Member) {
//			Member member = (Member) obj;
//			return member.name.equals(name) && (member.age == age);
//		} else {
//			return false;
//		}
//	}
//
//	public int hashCode() { // 이게 가장 중요함.
//		return name.hashCode() + age;
//	}

}

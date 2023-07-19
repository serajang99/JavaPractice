package syntax.day_05;

import java.util.Objects;

public class MyMember implements Comparable<MyMember> {

	private String name; //이름
	private int age; //나이

	// 생성자 2개. 기본생성자, 모든 변수 받는 생성자
	public MyMember() {
	}
	
	// getter, setter
	public MyMember(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// toString() 변수의 현재값을 문자열로 반환(디버깅용)
	@Override
	public String toString() {
		return "MyMember [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(MyMember o) {
		// 나이 기준 정렬 
		return this.age - o.getAge();
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
		MyMember other = (MyMember) obj;
		return age == other.age && Objects.equals(name, other.name);
	}	
	
	
}

package day_03;

public class MyInfo {
	private int age; // 범위 (정보 은닉 :메소드를 통해서 제한적인 접근 가능)
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	int age2; // 접근제한자 생략시 default라 칭함.
}


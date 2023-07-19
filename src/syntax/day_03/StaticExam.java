package syntax.day_03;

public class StaticExam {
	
	int age = 0;
	
	public static void main(String[] args) {
		test1();
	}

	static void test1() {
		// static 메서드 안에서는 this를 쓸 수 없다.
		// this는 heap 공간에 올라가있는 객체의 주소를 가리키기 때문에 heap에 저장되지 않는 static과는 별개
		
	}
}

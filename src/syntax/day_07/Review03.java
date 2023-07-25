package syntax.day_07;

public class Review03 {
	
	final int i = 100; 
	static int j = 200;
	{ // 초기화블록(생성자메서드랑 비슷한 개념)
	
	}
	static { // static 초기화블록
		
	}
	
	public Review03() {
//		this.i = 300; // final 변수는 바꿀 수 없다
	}
	
	public static void main(String[] args) {
//		 System.out.println(i); // static 함수 안에서 non-static 멤버 변수를 받아올 수 없다
		
		Review03 r = new Review03();
		System.out.println(r.i);
		System.out.println(Review03.j);
		System.out.println(Math.PI); // Math: static class -> 다른 클래스가 상속 불가능
		
	}
	// static 이 붙고 안붙고는 오버로딩에 상관이 없다
//	static void a() {}
//	void a() {}
	
}

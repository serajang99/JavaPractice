package syntax.day_07;

public class Review02 {

	static int i; // 멤버 변수(0으로 자동 초기화)
	static String str; // 멤버 변수(null 자동 초기화)

	public static void main(String[] args) {
		int i; // 지역 변수(초기화 안한 선언)
		String str; // 지역 변수(초기화 안한 선언)
		// -> 지역 변수일 경우 초기화 안하면 에러, 멤버 변수일 경우 자동으로 기본값으로 초기화
//		System.out.println(i); 
	}
}

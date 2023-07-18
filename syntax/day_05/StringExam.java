package day_05;

public class StringExam {
	public static void main(String[] args) {
		System.out.println("홍길동".compareTo("박길동"));
		// String 비교
		String s1 = "abc"; // 상수 - Method 영역에 딱 하나 존재 (s1, s2 는 같은 주소를 가리킨다)
		String s2 = "abc";
		String s3 = new String("abc"); // 객체 - Stack에 저장되고 Heap에 메모리 로딩 된다
		String s4 = new String("abc"); // 각각 다른 객체로 s3와 s4는 서로 다른 주소를 가리킨다.
		System.out.println("s1=s2 "+(s1==s2)); // true
		System.out.println("s3=s4 "+(s3==s4)); // false
		
		// 내부 문자열비교
		System.out.println("s3.equals(s4) "+s3.equals(s4));
		
	}
}

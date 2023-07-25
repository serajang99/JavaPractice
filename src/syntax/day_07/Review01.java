package syntax.day_07;

public class Review01 {
	public static void main(String[] args) {
		int i = 100;
		long l = 200;
		float f = l;
		long l2 = (long) f; // 정수형 실수형은 강제로라도 타입 변환 가능
//		boolean b = (boolean) i; // 정수형(숫자) <-> 불린타입 : 형 변환 (강제로도) 불가능 -> Wrapper Class를 통한 변환만 가능 
//		String s = (String) i; // 정수형(숫자) <-> 객체 : 마찬가지
//		큰 타입 = 큰 타입 - 작은 타입;
//		int j = 1.0 + 2; // 오류 발생 1.0(double) + 2(int)
		double f2 = 1.0 + 2;
	}
}

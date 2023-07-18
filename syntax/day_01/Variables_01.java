package day_01;

public class Variables_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v; //선언
		v = 30; //대입
		int g = 65;
		System.out.println(Integer.toBinaryString(g));
		int i2 = 0xabcdef;
		System.out.println(i2);
		
		char c1 = '가';
		char c2 = '나';
		System.out.println(c1 < c2);
		System.out.println(c1);
		int ci1 = c1;
		System.out.println(ci1);
		ci1++; //44033
		ci1++; //44034
		ci1++; //44035
		ci1++; 
		System.out.println((char)ci1);
		boolean b1 = true; // or false
		String s1 = "abc"; 
		byte bt1 = 100;
		int it1 = bt1; // int(32bit) <- byte(8bit) 가능		
//		bt1 = it1; // byte(8bit) <- int(32bit) 불가능
		bt1 = (byte)it1; // byte(8bit) <- int(32bit) 강제 형변환 가능
		System.out.println(it1);
		
		// 타입명의 첫 자가 대문자인 것과 기본 타입간의 형 변환 불가능하다. 
		// 예) String <--> int
		byte b22 = 10 + 20; // 상수+상수 더하기 가능
		b22 = (byte)(b22 + 1); // 변수+상수 더하기 불가능 -> 전체를 형 변환
		
		int intvalue = 17 / 4 + 3;
		float floatvalue = intvalue;
		System.out.println(floatvalue);
		intvalue = (int) floatvalue;
		System.out.println(intvalue);
		
		int x = 1;
		int y = 2;
		double result = (double) x /  y;
		System.out.println(result);
		
	}

}

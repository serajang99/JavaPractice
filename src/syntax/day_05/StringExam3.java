package syntax.day_05;

public class StringExam3 {
	public static void main(String[] args) {
//		StringBuilder : 고속 문자열 처리 객체 
		String s = "0123456789";
		String s2 = "";
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			s2 = s2 + s; // 새로운 메모리 사용
		}
		long end = System.currentTimeMillis();
		System.out.println("실행시간: "+(end-start));
//		System.out.println(s2);
		
		// 
		StringBuffer ssb = new StringBuffer(); // builder 나오기 전에 쓰던거 
		StringBuilder sb = new StringBuilder();
		start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			sb.append(s);
		}
		end = System.currentTimeMillis();
		System.out.println("실행시간2: "+(end-start));
//		System.out.println(s2);
	}
}

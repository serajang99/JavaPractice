package syntax.day_07;

import java.util.HashSet;

public class SetExam {
	
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("홍");
		hs.add("김");
		hs.add("박");
		hs.add("홍");
		System.out.println(hs);
		hs.remove("김");
		System.out.println(hs);
	}
}

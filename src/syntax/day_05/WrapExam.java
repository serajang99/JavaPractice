package syntax.day_05;

import java.util.ArrayList;

public class WrapExam {
	public static void main(String[] args) {
		int i = 5;
		int x = 4;
		Integer ii = i; // Auto Boxing
		String ss = ii.toString();
		System.out.println(ss);
		String ss2 = "200";
		int k  = Integer.parseInt(ss2);
		System.out.println(k);
		
		int j = ii; // Unboxing

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(j);
		System.out.println(list);
	}
}

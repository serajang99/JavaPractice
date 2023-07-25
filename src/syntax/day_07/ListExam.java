package syntax.day_07;

import java.util.ArrayList;

public class ListExam {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("홍");
		arr.add("김");
		arr.add("박");
		System.out.println(arr);
		arr.add(1, "최");
		System.out.println(arr);
		arr.set(1, "강");
		System.out.println(arr);
		System.out.println(arr.get(2));
		arr.remove(0);
		System.out.println(arr);
		arr.remove("김"); // remove(Object o) -> Object의 모든 자식들은 remove 대상으로 가능 
		System.out.println(arr);
	}
}

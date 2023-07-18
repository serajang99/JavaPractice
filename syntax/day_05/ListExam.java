package day_05;

import java.util.ArrayList;

public class ListExam {
	public static void main(String[] args) {
		//회원이름관리
		ArrayList<String> names = new ArrayList<String>();
		names.add("홍길동");
		names.add("김길동");
		names.add("박길동");
		System.out.println(names);
		names.add(1, "박길동");
		System.out.println(names);
		String r = names.remove(2); // 지운 값이 반환됨(String)
		System.out.println(r);
		System.out.println(names);
		names.clear(); // 전체삭제
		System.out.println(names);
	}
}

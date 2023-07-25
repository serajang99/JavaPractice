package syntax.day_07;

import java.util.HashMap;

public class MapExam {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("홍", 70);
		hm.put("김", 80);
		hm.put("강", 80);
		System.out.println(hm);
//		hm.put("강", 70);
//		System.out.println(hm);

		// HashMap에 홍길동의 수학점수 90, 영어점수 80을 저장하려한다.
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		hs.put("수학", 90);
		hs.put("영어", 80);
		HashMap<String, HashMap<String,Integer>> hscore = new HashMap<String, HashMap<String,Integer>>();
		hscore.put("홍", hs);
		System.out.println(hscore);
	}
}

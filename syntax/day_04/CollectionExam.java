package day_04;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionExam {
	public static void main(String[] args) {
		// 로또 번호 생성기
		// List 타입 : int[]
		ArrayList<Integer> lottoList = new ArrayList<Integer>();
		HashSet<Integer> lottoSet = new HashSet<Integer>();
		for (int i = 0; i < 6; i++) {
			int r = (int) (Math.random() * 45 + 1);
//			if (lottoList.contains(r)) {
//				continue;
//			}
			lottoSet.add(r);
			lottoList.add(r);
			
		}
		System.out.println(lottoList);
		System.out.println(lottoSet);
		System.out.println(lottoList.get(0));
		System.out.println(lottoList.size());
		System.out.println(lottoSet.size());
	}
}

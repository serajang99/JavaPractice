package day_05;

import java.util.Arrays;

public class CompareExam {
	public static void main(String[] args) {
		MyMember[] mems = new MyMember[4];
		int count = 0; // 객체를 저장할 위치 -> 저장갯수
		mems[count++] = new MyMember("홍길동", 33);
		mems[count++] = new MyMember("김길동", 35);
		mems[count++] = new MyMember("박길동", 30);
		mems[count++] = new MyMember("홍길동", 33);
		// 배열 정렬은 Arrays.sort(배열)
		Arrays.sort(mems, new NameComparator());
		
		for (int i = 0; i < count; i++) {
			System.out.println(mems[i]);
		}
		System.out.println("mems[0]==mems[1] "+(mems[0]==mems[1]));
		System.out.println("mems[0].equals(mems[1]) "+(mems[0].equals(mems[1])));
	}
}

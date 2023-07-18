package day_04;

import java.util.Arrays;

public class CompareExam {
	public static void main(String[] args) {
		MyMember[] mems = new MyMember[3];
		int count = 0; // 객체를 저장할 위치 -> 저장갯수
		mems[count++] = new MyMember("홍길동", 33);
		mems[count++] = new MyMember("김길동", 35);
		mems[count++] = new MyMember("박길동", 30);
		Arrays.sort(mems);
		for (int i = 0; i < count; i++) {
			System.out.println(mems[i]);
		}
	}
}

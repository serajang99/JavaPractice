package day_04;

public class MyMemberExam2 {
	public static void main(String[] args) {
		MyMemberService ms = new MyMemberService();
		MyMember mm = new MyMember("홍길동", 33);
		ms.add(mm);
		mm = new MyMember("김길동", 35);
		ms.add(mm);
		mm = new MyMember("박길동", 30);
		ms.add(mm);

		System.out.println("저장갯수=" + ms.getCount());

		// 목록출력
		ms.printAll();

		// 검색 - 김길동의 참조값 반환 or 순서번호 반환
		// 검색의 성공, 실패 -> 성공: 양수(인덱스번호), 실패: -1
		// true/false
		// 참조값: 참조값 / null
		MyMember findMem = ms.searchByName("김길동");
		if (findMem == null) {
			System.out.println("못 찾았음");
		} else {
			System.out.println("찾았음: " + findMem);
		}

		// 수정 - 김길동의 나이 1증가
		boolean b = ms.update("김길동2", 1);
		if (b)
			System.out.println("수정 성공");
		else
			System.out.println("수정 실패");

	}
}

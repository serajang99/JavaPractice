package syntax.day_06;

import syntax.day_06.service.MyShapeListService;

/** 자바 그림판 메인 테스트 클래스 */
public class PainterServiceListExam {
	public static void main(String[] args) {
		MyShapeListService mss = new MyShapeListService();

		MyLine ml = new MyLine(0, 0, 3, 3);
		mss.add(ml);
		ml = new MyLine(3, 3, 9, 9);
		mss.add(ml);
		ml = new MyLine(6, 6, 19, 19);
		mss.add(ml);
		ml = new MyLine(9, 9, 29, 29);
		mss.add(ml);

		System.out.println("저장갯수: " + mss.getCount());

		// 검색. 시작 좌표로 검색. 반환 타입 -> 인덱스번호, 객체의 참조값
		MyShape findShape = mss.findByPosition(3, 3);
		if (findShape == null) {
			System.out.println("못찾음");
		} else {
			System.out.println("찾음: " + findShape);
		}

		// 삭제
		boolean b = mss.remove(findShape);
		System.out.println("삭제: "+b);

		// 전체출력
		mss.printAll();
	}
}

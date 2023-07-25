package syntax.day_06;

/** 자바 그림판 메인 테스트 클래스 */
public class PainterExam2 {

	public static void main(String[] args) {

		MyLine[] lines = new MyLine[100]; // 100개는 최대치
		MyCircle[] circles = new MyCircle[100]; // 100개는 최대치

		MyLine ml = new MyLine(0, 0, 0, 0);
		lines[0] = ml;
//		circles[0] = ml; // 형변환

		MyShape p = ml; // 부모에 저장(업캐스팅)은 가능 -> 업캐스팅 하는 이유는 간편한 관리를 위해서
		MyShape[] msarr = new MyShape[100];
		msarr[0] = ml;
		msarr[1] = new MyCircle(0, 0, 10);

		MyShape ms = new MyCircle(0, 0, 10);
		// 오버라이딩한 자식의 메서드가 호출
		System.out.println(ms.draw());
	}
}

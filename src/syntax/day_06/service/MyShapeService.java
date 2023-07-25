package syntax.day_06.service;

import syntax.day_06.MyShape;

/** 도형들의 부모, 공통 변수, 메서드 정의 */
public class MyShapeService {
	private MyShape[] lines = new MyShape[100];
	private int count = 0;

	// 오버로딩
	// 매개변수를 자식타입으로 (선호 X)
//	public void add(MyLine ml) {
//		lines[count++] = ml;
//	}
//
//	public void add(MyCircle ml) {
//		lines[count++] = ml;
//	}

	// 매개변수를 부모타입으로 (선호)
	public void add(MyShape ml) {
		lines[count++] = ml;
	}

	public int getCount() {
		return count;
	}

	public MyShape findByPosition(int startX, int startY) {
		for (int i = 0; i < count; i++) {
			MyShape myShape = lines[i];
			if (myShape.getX() == startX && myShape.getY() == startY) {
				return myShape;
			}
		}
		return null; // 못찾으면 null 반환
	}

	public boolean remove(MyShape findShape) {
		for (int i = 0; i < count; i++) {
			MyShape myShape = lines[i];
			if (myShape.equals(findShape)) {
				remove(i);
				return true;
			}
		}
		return false;
	}

	private void remove(int i) {
		// n-> i~ <n
		for (int j = i; j < count; j++) {
			lines[j] = lines[j+1];
		}
		count--;
	}

	public void printAll() {
		System.out.println("** 전체 출력 **");
		for (int i = 0; i < count; i++) {
			System.out.println(lines[i]);
		}
		System.out.println();
	}
}

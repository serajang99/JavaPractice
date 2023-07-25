package syntax.day_06;

import java.util.ArrayList;

/** 도형들의 부모, 공통 변수, 메서드 정의 */
public class MyShapeListService {
	private ArrayList<MyShape> shapes = new ArrayList<MyShape>();

	public MyShapeListService() {
	}

	public void add(MyShape ms) {
		shapes.add(ms);
	}

	public int getCount() {
		return shapes.size();
	}

	public MyShape findByPosition(int startX, int startY) {
		for (MyShape myShape : shapes) {
			if (myShape.getX() == startX && myShape.getY() == startY)
				return myShape;
		}
		return null;
	}

	public boolean remove(MyShape findShape) {
		return shapes.remove(findShape);
	}

	public void printAll() {
		System.out.println("** 전체 출력 **");
		for (MyShape myShape : shapes) {
			System.out.println(myShape);
		}
	}

}

package syntax.day_06;

/** 도형들의 부모, 공통 변수, 메서드 정의 */
public class MyShape {
	private int x = 100, y = 200;

	// 생성자 메서드(기본, 모든 멤버를 매개변수로 받는 생성자)
	public MyShape() {
	}

	public MyShape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public String draw() {
		return "";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y ;
	}
	
}

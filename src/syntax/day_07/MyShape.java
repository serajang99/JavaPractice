package syntax.day_07;

/** 도형들의 공통속성정의 */
public abstract class MyShape { // 자식에서 강제로 오버라이딩하도록 하는 것이 abstract 클래스의 역할 
	private int x, y; // 도형 기준 좌표

	public abstract String draw(); // 도형 그리기 기능 제공

	public MyShape() {
	}

	public MyShape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
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
		StringBuilder builder = new StringBuilder();
		builder.append("MyShape [x=").append(x).append(", y=").append(y).append("]");
		return builder.toString();
	}

}

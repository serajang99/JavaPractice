package syntax.day_07;

public class MyLine extends MyShape {

	private int x2, y2;

	public MyLine() {
	}

	public MyLine(int x1, int y1, int x2, int y2) {
		super(x1, y1);
		this.x2 = x2;
		this.y2 = y2;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	// MyShape는 abstract이기 때문에 abstract 메서드 오버라이딩 필수 구현
	@Override
	public String draw() {
		return "Line";
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyLine [x2=").append(x2).append(", y2=").append(y2).append("]");
		return builder.toString();
	}

}

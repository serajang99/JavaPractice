package syntax.day_04;

public class Emp extends Person{
	
	private String buseo;
	
	public Emp() {
	}

	public Emp(String id, String name, String buseo) {
		super(id, name);
		this.buseo = buseo;
	}
	
	public String getBuseo() {
		return buseo;
	}

	public void setBuseo(String buseo) {
		this.buseo = buseo;
	}

	@Override
	public String toString() {
		return super.toString() +", buseo=" + buseo;
	}
	// 메소드 이름이 같고 파라미터가 다르면 오버로딩
	// 메소드 이름이 같고 파라미터가 같으면 오버라이딩
	//
	
	
}

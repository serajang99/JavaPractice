package ws_0726;

public class CD extends Item {
	private String singer;
	
	public CD() {
		// TODO Auto-generated constructor stub
	}
	
	

	public CD(int itemNum, String title, int price, String singer, int quantity) {
		super(itemNum, title, price, quantity);
		this.singer = singer;
	}



	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString()).append(", singer=").append(singer);
		return builder.toString();
	} 
	
	
}

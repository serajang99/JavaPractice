package ws_0726;

public class Video extends Item {
	private String producer;
	
	public Video() {
		// TODO Auto-generated constructor stub
	}

	public Video(int itemNum, String title, int price, String producer, int quantity) {
		super(itemNum, title, price, quantity);
		this.producer = producer;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString()).append(", producer=").append(producer);
		return builder.toString();
	}
	
	
	
}

package ws_0726;

public class Book extends Item {
	private String publisher;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int itemNum, String title, int price, String publisher, int quantity) {
		super(itemNum, title, price, quantity);
		this.publisher = publisher;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString()).append(", publisher=").append(publisher);
		return builder.toString();
	}
	
	
	
}

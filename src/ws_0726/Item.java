package ws_0726;

public class Item {
	private int itemNum;
	private String title;
	private int price;
	private int quantity;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int itemNum, String title, int price, int quantity) {
		super();
		this.itemNum = itemNum;
		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}

	public int getItemNum() {
		return itemNum;
	}

	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("itemNum=").append(itemNum).append(", title=").append(title).append(", price=").append(price)
				.append(", quantity=").append(quantity);
		return builder.toString();
	}
	
	
	
}

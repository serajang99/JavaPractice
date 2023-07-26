package ws_0726;

public class Member {
	private String id;
	private String name;
	private String pw;
	private String contact;

	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String id, String name, String pw, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.contact = contact;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("id=").append(id).append(", name=").append(name).append(", pw=").append(pw).append(", contact=")
				.append(contact);
		return builder.toString();
	}

}

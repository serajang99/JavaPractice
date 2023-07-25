package ws_0724;

public class MyMember {
	private int memberNumber;
	private String memberType;
	private String memberPhone;

	public MyMember() {
	}

	public MyMember(int memberNumber, String memberType, String memberPhone) {
		super();
		this.memberNumber = memberNumber;
		this.memberType = memberType;
		this.memberPhone = memberPhone;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	@Override
	public String toString() {
		return "[memberNumber=" + memberNumber + ", memberType=" + memberType + ", memberPhone=" + memberPhone;
	}

}

package ws_0724;

public class CorporateMember extends MyMember {
	private int registNumber;
	private String memberName;

	public CorporateMember() {
	}

	public CorporateMember(int memberNumber, String memberType, String memberName, String memberPhone,
			int registNumber) {
		super(memberNumber, memberType, memberPhone);
		this.registNumber = registNumber;
		this.memberName = memberName;
	}

	public int getRegistNumber() {
		return registNumber;
	}

	public void setRegistNumber(int registNumber) {
		this.registNumber = registNumber;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return super.toString()+", registNumber=" + registNumber + ", memberName=" + memberName + "]";
	}

}

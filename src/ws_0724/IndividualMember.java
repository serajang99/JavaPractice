package ws_0724;

public class IndividualMember extends MyMember {
	private String memberName;

	public IndividualMember() {
	}

	public IndividualMember(int memberNumber, String memberType, String memberPhone, String memberName) {
		super(memberNumber, memberType, memberPhone);
		this.memberName = memberName;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return super.toString()+", memberName=" + memberName + "]";
	}

}

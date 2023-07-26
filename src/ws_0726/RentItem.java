package ws_0726;

public class RentItem {
	private int rentalId; // 대여번호
	private String rentalMemberId; // 회원id
	private int rentalItemNum; // 대여할 물건 관리번호
	private String rentalDate; // 대여일
	private int rentalTime; // 대여시간
	private int rentalMin; // 대여분
	private String returnDate; // 반납일
	private int returnTime; // 반납시간
	private int returnMin; // 반납분

	public RentItem() {
		// TODO Auto-generated constructor stub
	}

	public RentItem(int rentalId, String rentalMemberId, int rentalItemNum, String rentalDate, int rentalTime,
			int rentalMin, String returnDate, int returnTime, int returnMin) {
		super();
		this.rentalId = rentalId;
		this.rentalMemberId = rentalMemberId;
		this.rentalItemNum = rentalItemNum;
		this.rentalDate = rentalDate;
		this.rentalTime = rentalTime;
		this.rentalMin = rentalMin;
		this.returnDate = returnDate;
		this.returnTime = returnTime;
		this.returnMin = returnMin;
	}

	public int getRentalMin() {
		return rentalMin;
	}

	public void setRentalMin(int rentalMin) {
		this.rentalMin = rentalMin;
	}

	public int getReturnMin() {
		return returnMin;
	}

	public void setReturnMin(int returnMin) {
		this.returnMin = returnMin;
	}

	public int getRentalId() {
		return rentalId;
	}

	public void setRentalId(int rentalId) {
		this.rentalId = rentalId;
	}

	public String getRentalMemberId() {
		return rentalMemberId;
	}

	public void setRentalMemberId(String rentalMemberId) {
		this.rentalMemberId = rentalMemberId;
	}

	public int getRentalItemNum() {
		return rentalItemNum;
	}

	public void setRentalItemNum(int rentalItemNum) {
		this.rentalItemNum = rentalItemNum;
	}

	public String getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(String rentalDate) {
		this.rentalDate = rentalDate;
	}

	public int getRentalTime() {
		return rentalTime;
	}

	public void setRentalTime(int rentalTime) {
		this.rentalTime = rentalTime;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public int getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(int returnTime) {
		this.returnTime = returnTime;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("rentalId=").append(rentalId).append(", rentalMemberId=").append(rentalMemberId)
				.append(", rentalItemNum=").append(rentalItemNum).append(", rentalDate=").append(rentalDate)
				.append(", rentalTime=").append(rentalTime).append(", rentalMin=").append(rentalMin)
				.append(", returnDate=").append(returnDate).append(", returnTime=").append(returnTime)
				.append(", returnMin=").append(returnMin);
		return builder.toString();
	}

}

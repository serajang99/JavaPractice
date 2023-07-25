package ws_0724;

public class RentCar {
	private int rentalId; // 대여일련번호
	private int rentalCarNumber; // 차번호
	private int rentalMemberNumber; // 대여자 회원번호
	private int rentalPrice; // 대여비(만원)
	private String rentalDate; // 대여일
	private int rentalTime; // 대여시간
	private String returnDate; // 반납일
	private int returnTime; // 반납시간

	public RentCar() {
	}

	public RentCar(int rentalId, int rentalCarNumber, int rentalMemberNumber, int rentalPrice, String rentalDate, int rentalTime,
			String returnDate, int returnTime) {
		super();
		this.rentalId = rentalId;
		this.rentalCarNumber = rentalCarNumber;
		this.rentalMemberNumber = rentalMemberNumber;
		this.rentalPrice = rentalPrice;
		this.rentalDate = rentalDate;
		this.rentalTime = rentalTime;
		this.returnDate = returnDate;
		this.returnTime = returnTime;
	}

	public int getRentalId() {
		return rentalId;
	}

	public void setRentalId(int rentalId) {
		this.rentalId = rentalId;
	}

	public int getRentalCarId() {
		return rentalCarNumber;
	}

	public void setRentalCarId(int rentalCarId) {
		this.rentalCarNumber = rentalCarId;
	}

	public int getRentalMemberId() {
		return rentalMemberNumber;
	}

	public void setRentalMemberId(int rentalMemberId) {
		this.rentalMemberNumber = rentalMemberId;
	}

	public int getRentalPrice() {
		return rentalPrice;
	}

	public void setRentalPrice(int rentalPrice) {
		this.rentalPrice = rentalPrice;
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
		return "RentalCar [rentalId=" + rentalId + ", rentalCarNumber=" + rentalCarNumber + ", rentalMemberNumber=" + rentalMemberNumber
				+ ", rentalPrice=" + rentalPrice + ", rentalDate=" + rentalDate + ", rentalTime=" + rentalTime
				+ ", returnDate=" + returnDate + ", returnTime=" + returnTime + "]";
	}

}

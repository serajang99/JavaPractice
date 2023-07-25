package ws_0724;

public class MyCar {
	private int carNumber; // 차번호
	private int rentalPrice; // 대여비(만원)
	private String carType; // 차종(승용차,승합차,버스,트럭)
	private int carYear; // 연식(1990)
	private int carEngine;// 배기량(1990)

	public MyCar() {
	}

	public MyCar(int carNumber, int rentalPrice, String carType, int carYear, int carEngine) {
		super();
		this.carNumber = carNumber;
		this.rentalPrice = rentalPrice;
		this.carType = carType;
		this.carYear = carYear;
		this.carEngine = carEngine;
	}

	@Override
	public String toString() {
		return "[carNumber=" + carNumber + ", rentalPrice=" + rentalPrice + ", carType=" + carType + ", carYear="
				+ carYear + ", carEngine=" + carEngine;
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public int getRentalPrice() {
		return rentalPrice;
	}

	public void setRentalPrice(int rentalPrice) {
		this.rentalPrice = rentalPrice;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public int getCarYear() {
		return carYear;
	}

	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}

	public int getCarEngine() {
		return carEngine;
	}

	public void setCarEngine(int carEngine) {
		this.carEngine = carEngine;
	}

}

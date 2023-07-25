package ws_0724;

public class Van extends MyCar {
	private int passenger; // 탑승 인원 수
	private int carCapacity; // 적재량

	public Van() {
	}

	public Van(int carNumber, int rentalPrice, String carType, int carYear, int carEngine,int passenger, int carCapacity) {
		super(carNumber, rentalPrice, carType, carYear, carEngine);
		this.passenger = passenger;
		this.carCapacity = carCapacity;
	}

	public int getPassenger() {
		return passenger;
	}

	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}

	public int getCarCapacity() {
		return carCapacity;
	}

	public void setCarCapacity(int carCapacity) {
		this.carCapacity = carCapacity;
	}

	@Override
	public String toString() {
		return super.toString()+", passenger=" + passenger + ", carCapacity=" + carCapacity + "]";
	}

}

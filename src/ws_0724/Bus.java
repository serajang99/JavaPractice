package ws_0724;

public class Bus extends MyCar {
	private int passenger; // 탑승 인원 수

	public Bus() {
	}

	public Bus(int carNumber, int rentalPrice, String carType, int carYear, int carEngine,int passenger) {
		super(carNumber, rentalPrice, carType, carYear, carEngine);
		this.passenger = passenger;
	}

	public int getPassenger() {
		return passenger;
	}

	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}

	@Override
	public String toString() {
		return super.toString() + ", passenger=" + passenger + "]";
	}

}

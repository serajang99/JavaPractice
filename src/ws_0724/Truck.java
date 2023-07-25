package ws_0724;

public class Truck extends MyCar {
	private int carCapacity; // 적재량

	public Truck() {
	}

	public Truck(int carNumber, int rentalPrice, String carType, int carYear, int carEngine,int carCapacity) {
		super(carNumber, rentalPrice, carType, carYear, carEngine);
		this.carCapacity = carCapacity;
	}

	public int getCarCapacity() {
		return carCapacity;
	}

	public void setCarCapacity(int carCapacity) {
		this.carCapacity = carCapacity;
	}

	@Override
	public String toString() {
		return super.toString()+", carCapacity=" + carCapacity + "]";
	}

}

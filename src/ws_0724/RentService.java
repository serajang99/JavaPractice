package ws_0724;

import java.util.ArrayList;

public class RentService {
	private ArrayList<MyCar> cars = new ArrayList<MyCar>();
	private ArrayList<MyMember> mems = new ArrayList<MyMember>();
	private ArrayList<RentCar> rents = new ArrayList<RentCar>();

	public void add(MyCar myCar) {
		cars.add(myCar);
		
		System.out.println("** cars 목록 **");
		for (MyCar mc : cars) {
			System.out.println(mc);
		}
	}

	public void add(MyMember myMember) {
		mems.add(myMember);
		
		System.out.println("** mems 목록 **");
		for (MyMember mm : mems) {
			System.out.println(mm);
		}
	}

	public void rent(int memberNumber, int carNumber, int rentalPrice, String rentalDate, int rentalTime,
			String returnDate, int returnTime) {
		RentCar rc = new RentCar(rents.size(), memberNumber, carNumber, rentalPrice, rentalDate, rentalTime, returnDate,
				returnTime);
		rents.add(rc);
		
		System.out.println("** rents 목록 **");
		for (RentCar mr : rents) {
			System.out.println(mr);
		}
	}

	public int getRentCount() {
		return rents.size();
	}

}

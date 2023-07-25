package ws_0724;

public class RentExam {
	public static void main(String[] args) {
		RentService rs = new RentService();
		Car car = new Car(1111, 1, "승용차", 1990, 2000, 5);
		rs.add(car);
		Van van = new Van(2222, 2, "승합차", 2000, 2100, 10, 5);
		rs.add(van);
		Bus bus = new Bus(3333, 3, "버스", 2020, 2200, 30);
		rs.add(bus);
		Truck truck = new Truck(4444, 4, "트럭", 1970, 2300, 20);
		rs.add(truck);

		IndividualMember im = new IndividualMember(100, "개인", "010-0000-0000", "홍길동");
		rs.add(im);
		CorporateMember cm = new CorporateMember(2000, "법인", "(주)멀캠", "02-1234-1234", 12345);
		rs.add(cm);

		rs.rent(100, 1111, 10, "2023-07-01", 7, "2023-07-07", 17);
		rs.rent(1000, 1111, 30, "2023-07-02", 7, "2023-07-05", 17);

		int rentCount = rs.getRentCount();
		System.out.println("총 대여 횟수: "+rentCount);

	}
}

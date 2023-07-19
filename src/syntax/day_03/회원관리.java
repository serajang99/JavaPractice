package syntax.day_03;

public class 회원관리 {
	public static void main(String[] args) {
//		MyMember m1 = new MyMember("홍길동", 33, "111-222");
//		MyMember m2 = new MyMember("김길동", 35, "111-333");
		MyMember[] mems = new MyMember[3]; // 배열 객체 1개(방이 3개인 아파트 1개)가 만들어짐
		mems[0] = new MyMember("홍길동", 33, "111-222");
		System.out.println(mems[0].toString());
		
	}
}

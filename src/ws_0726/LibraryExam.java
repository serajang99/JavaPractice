package ws_0726;

import java.util.ArrayList;

public class LibraryExam {
	public static void main(String[] args) {
		LibraryService libSvc = new LibraryService();
		// 회원 등록
		try {
			libSvc.add(new Member("user01", "홍", "1111", "010-111"));
		} catch (회원아이디중복Exception e) {
			e.printStackTrace();
		}
		try {
			libSvc.add(new Member("user02", "김", "2222", "010-222"));
		} catch (회원아이디중복Exception e) {
			e.printStackTrace();
		}
		try {
			libSvc.add(new Member("user01", "박", "3333", "010-333"));
		} catch (회원아이디중복Exception e) {
			e.printStackTrace();
		} // 예외 발생

		// 물건 등록
		libSvc.add(new Book(100, "자바기본", 20000, "한빛출판사", 3));
		libSvc.add(new Video(200, "자바강좌", 15000, "명랑출판사", 3));
		libSvc.add(new CD(300, "자바실습", 15000, "자바출판사", 3));
		libSvc.add(new Book(100, "자바기본", 20000, "한빛출판사", 3));
		// 회원 검색
		ArrayList<Member> m2 = libSvc.findMemberByName("홍");
		System.out.println(m2);
		Member m = libSvc.findMemberById("user01");
		System.out.println(m);
		// 물건 검색
		Item i = libSvc.findItemByTitle("자바기본");
		System.out.println(i);
		libSvc.printAll();

		// 대여
		try {
			libSvc.rent(i.getItemNum(), m.getId(), "20230726", 13, 7, 3);
		} catch (미등록회원idException | 미등록물건Exception | 수량부족Exception e) {
			e.printStackTrace();
		}
		try {
			libSvc.rent(i.getItemNum(), m.getId(), "20230725", 10, 20, 1);
		} catch (미등록회원idException | 미등록물건Exception | 수량부족Exception e) {
			e.printStackTrace();
		}

		libSvc.printAll();
		// 반납
		try {
			libSvc.returnItem(i.getItemNum(), m.getId(), "20230726", 10, 20, 1);
		} catch (미등록회원idException | 미등록물건Exception e) {
			e.printStackTrace();
		}
		libSvc.printAll();
	}
}

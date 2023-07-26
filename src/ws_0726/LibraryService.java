package ws_0726;

import java.util.ArrayList;

public class LibraryService {
	private ArrayList<Member> mems = new ArrayList<Member>();
	private ArrayList<Item> libraryItems = new ArrayList<Item>();
	private ArrayList<RentItem> rents = new ArrayList<RentItem>();

	public void add(Item myLibraryItem) {
		for (Item item : libraryItems) {
			if (item.getTitle() == myLibraryItem.getTitle()) {
				item.setQuantity(item.getQuantity() + myLibraryItem.getQuantity());
				return;
			}
		}
		libraryItems.add(myLibraryItem);
	}

	public void add(Member myMember) throws 회원아이디중복Exception {
		for (Member member : mems) {
			if (member.getId() == myMember.getId())
				throw new 회원아이디중복Exception(member.getId() + "는 이미 존재하는 아이디입니다");
		}
		mems.add(myMember);
	}

	public void add(RentItem rentItem) {
		rents.add(rentItem);
	}

	public ArrayList<Member> findMemberByName(String name) {
		ArrayList<Member> result = new ArrayList<Member>();
		for (Member member : mems) {
			if (member.getName() == name)
				result.add(member);
		}
		return result;
	}

	public Member findMemberById(String id) {
		for (Member member : mems) {
			if (member.getId() == id)
				return member;
		}
		return null;
	}

	public Item findItemByTitle(String title) {
		for (Item item : libraryItems) {
			if (item.getTitle() == title)
				return item;
		}
		return null;
	}

	public Item findItemByItemNum(int itemNum) {
		for (Item item : libraryItems) {
			if (item.getItemNum() == itemNum)
				return item;
		}
		return null;
	}

	public void printAll() {

		System.out.println("** 회원 수 **");
		System.out.println(mems.size());

		System.out.println("** 회원 목록 **");
		for (Member mm : mems) {
			System.out.println(mm);
		}

		System.out.println("** 종류별 물건 수 **");
		int bookCount = 0, videoCount = 0, cdCount = 0;
		for (Item mc : libraryItems) {
			if (mc instanceof Book)
				bookCount++;
			else if (mc instanceof Video)
				videoCount++;
			else if (mc instanceof CD)
				cdCount++;
		}
		System.out.println("도서: " + bookCount + "개");
		System.out.println("비디오: " + videoCount + "개");
		System.out.println("CD: " + cdCount + "개");

		System.out.println("** 도서 물품 목록 **");
		for (Item mc : libraryItems) {
			System.out.println(mc);
		}

	}

	public void rent(int itemNum, String rentalMemberId, String rentalDate, int rentalHour, int rentalMin, int quantity)
			throws 미등록회원idException, 미등록물건Exception, 수량부족Exception {
		Member findMember = findMemberById(rentalMemberId);
		if (findMember == null)
			throw new 미등록회원idException(rentalMemberId + "는 미등록 회원 id입니다.");

		Item findItem = findItemByItemNum(itemNum);
		if (findItem == null)
			throw new 미등록물건Exception(itemNum + "은 미등록 물건입니다.");

		if (findItem.getQuantity() - quantity < 0)
			throw new 수량부족Exception(itemNum + "의 수량이 부족합니다.");

		RentItem ri = new RentItem(rents.size() + 1, rentalMemberId, itemNum, rentalDate, rentalHour, rentalMin, null,
				-1, -1);
		rents.add(ri);
		findItem.setQuantity(findItem.getQuantity() - quantity);
	}
	
	public RentItem findItemByItemNumMemberId(int itemNum, String rentalMemberId) {
		for (RentItem rentItem : rents) {
			if(rentItem.getRentalItemNum() == itemNum && rentItem.getRentalMemberId() == rentalMemberId)
				return rentItem;
		}
		return null;
	}

	public void returnItem(int itemNum, String rentalMemberId, String returnDate, int returnHour, int returnMin,
			int quantity) throws 미등록회원idException, 미등록물건Exception {
		Member findMember = findMemberById(rentalMemberId);
		if (findMember == null)
			throw new 미등록회원idException(rentalMemberId + "는 미등록 회원 id입니다.");

		Item findItem = findItemByItemNum(itemNum);
		if (findItem == null)
			throw new 미등록물건Exception(itemNum + "은 미등록 물건입니다.");
		
		RentItem ri = findItemByItemNumMemberId(itemNum, rentalMemberId);
		ri.setReturnDate(returnDate);
		ri.setReturnTime(returnHour);
		ri.setRentalMin(returnMin);
		findItem.setQuantity(findItem.getQuantity()+quantity);
		
		return;
	}
}

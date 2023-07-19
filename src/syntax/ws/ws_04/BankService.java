package syntax.ws.ws_04;

import java.util.Collections;
import java.util.Comparator;

import java.util.ArrayList;

public class BankService {
	private ArrayList<AccountDto> accountList = new ArrayList<AccountDto>();
	private ArrayList<UserDto> userList = new ArrayList<UserDto>();

	public BankService() {

		// add 코드 적기
		int userCount = 1;
		userList.add(new UserDto(userCount++, "홍길동", "email@email.com", "010-1111-1111", true));
		userList.add(new UserDto(userCount++, "김길동", "email2@email.com", "010-2222-2222", true));
		userList.add(new UserDto(userCount++, "박길동", "email3@email.com", "010-3333-3333", true));

		int accountCount = 1;
		accountList.add(new AccountDto(accountCount++, "000000-00-0000", 0, 1));
		accountList.add(new AccountDto(accountCount++, "000001-00-0000", 1000, 1));
		accountList.add(new AccountDto(accountCount++, "000002-00-0000", 100000, 1));
		accountList.add(new AccountDto(accountCount++, "000003-00-0000", 99, 2));
		accountList.add(new AccountDto(accountCount++, "000004-00-0000", 1234, 2));
		accountList.add(new AccountDto(accountCount++, "000005-00-0000", 333, 3));

	}

	public ArrayList<AccountDto> getAccountList(int userSeq) {
		ArrayList<AccountDto> result = new ArrayList<AccountDto>();
		for (AccountDto accountDto : accountList) {
			if (userSeq == accountDto.getUserSeq()) {
				result.add(accountDto);
			}
		}
		return result;
	}

	public UserDto getUserDetail(int userSeq) {
		for (UserDto userDto : userList) {
			if (userSeq == userDto.getUserSeq()) {
				return userDto;
			}
		}
		return null;
	}

	public ArrayList<AccountDto> getAccountList() {
		return accountList;
	}

	public ArrayList<AccountDto> getAccountListSortByBalance() {
		Collections.sort(accountList);
		return accountList;
	}

	public ArrayList<AccountDto> getAccountListSortByUserSeq() {

		class UserSeqComparator implements Comparator<AccountDto> {
			@Override
			public int compare(AccountDto o1, AccountDto o2) {
				return o1.getUserSeq() - o2.getUserSeq();
			}

		}
		Collections.sort(accountList, new UserSeqComparator());
		return accountList;
	}

}

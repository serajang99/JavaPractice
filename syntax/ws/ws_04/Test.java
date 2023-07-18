package ws04;

public class Test {
	public static void main(String[] args) {
		BankService bankService = new BankService();
		System.out.println(bankService.getAccountList());
		System.out.println(bankService.getAccountList(1));
		System.out.println(bankService.getUserDetail(1));
		System.out.println(bankService.getAccountListSortByBalance());
		System.out.println(bankService.getAccountListSortByUserSeq());
	}
}

package ws_03;

public class BankExam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDto user = new UserDto(1, "홍길동","email@email.com","010-1234-1234",true);
		AccountDto account = new AccountDto(1,"1111-3333",0,1);
		
		System.out.println(user.toString());
		System.out.println(account.toString());
	}
}

package syntax.day_01;

public class SwitchExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가위바위보 컴퓨터 정하기 (0, 1, 2)
		double d = Math.random(); // 0 <= r < 1
		d *= 3; // 0.0 ~ 2.9999999999
		int i = (int)d;
		System.out.println(d);
		System.out.println(i);
		
		if (i == 0) {
			System.out.println("가위");
		} else if (i == 1) {
			System.out.println("바위");
		} else {
			System.out.println("보");
		}
		
		// int 1otto에 1~45 사이 로또번호 저장하는 코드를 작성
		int lotto = (int) (Math.random()*45 + 1); // 0.0 ~ 44.9999 -> 1.0 ~ 45.99999
		System.out.println(lotto);
		
		switch (i) {
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		case 2:
			System.out.println("보");
			break;
		default:
			break;
		}
	}

}

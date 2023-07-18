package day_01;

public class WhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~5까지
		// 단어 단위로 이동 Ctrl + 좌우 방향키
		int count = 0;
		while (count <= 5) {
			count++;
			if (count == 2) {
				continue;
			}
			if (count == 3) {
				break;
			}
			System.out.println(count);
		} // end while
		System.out.println("End");
	}

}

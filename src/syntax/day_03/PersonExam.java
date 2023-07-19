package syntax.day_03;

public class PersonExam {
	public static void main(String[] args) {
//		Person p1 = new Person();
		// 지역변수 선언(변수 생성) -> method 코드 실행 시 stack 내에 생성
		// method 종료하면 삭제됨(일회용 임시변수)
//		p1.name = "김길동";
//		p1.age = 33;
		
		Person p1 = new Person("김길동", 33);
		p1.printInfo();
		
		Person p2 = new Person("박길동", 35);
		p2.printInfo();
//		System.out.println(p2.name);
//		System.out.println(p2.age);

		Person p3 = new Person(35, "박길동");
		p3.printInfo();
//		System.out.println(p3.name);
//		System.out.println(p3.age);
	
	}
}

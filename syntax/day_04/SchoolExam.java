package day_04;

public class SchoolExam {
	public static void main(String[] args) {
		// 학교 내 인원관리
		// 관리대상 - 학생, 교수, 직원
		// 학생 - 학번, 이름, 학과
		// 교수 - 교번, 이름, 연구실호수
		// 직원 - 사번, 이름, 부서
		// class Person { id, name }
		// class Student extends Person { hakgwa }
		// class Teacher extends Person { yeongusil }
		// class Emp extends Person { buseo }
		Person p = new Person("100", "홍길동");
		System.out.println(p);
		
		Student st = new Student("200", "김길동", "컴공");
		System.out.println(st);
		
		Emp e = new Emp("300", "박길동", "개발");
		System.out.println(e);
		
		p = st;
		p = e;
		
		Person[] pa = new Person[100];
		pa[0] = st;
		pa[1] = e;
		System.out.println(pa[1]);
		
		// 학교 인원 관리 기능
		SchoolService ss = new SchoolService();
		ss.add(st);
		ss.add(p);
		ss.add(e);
		
		System.out.println(st instanceof Person); // 그 타입 혹은 그 타입의 자식 타입이냐 (상속관계에서만 작동 - 부모면 false, 상속관계가 아닐경우는 에러)
		if (p instanceof Student) {
			Student st2 = (Student) p; // Down-Casting
			System.out.println("학생입니다");
		} else {
			System.out.println("학생 아닙니다");
		}
	}
}

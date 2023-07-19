package syntax.day_03;

//public class는 파일 이름과 같아야 한다

/*
 * 클래스의 4가지 스타일(종류)
 * 1. VO-Value Object, DTO-Data Transfer Object: 데이터 저장용
 * ex) 각각 VO 
 * - 부서:영업부, 이름:김길동, 직급:대리
 * - 부서:개발부, 이름:박길동, 직급:대리
 * 2. Manager, DAO-Data Access Object: VO에 대한 관리기능(CRUD)
 * 3. UI: 입출력 인터페이스(CLI, GUI, WebUI, ...)
 * 4. IO: 데이터 입출력
 * */

/*
 * 접근 지정자
 * 접근 영역: 4가지(같은 클래스, 같은 패키지, 다른 패키지 자식 클래스, 아무 패키지 아무 클래스)
 * 
 * */

/*
 * 
 * Singleton Pattern
 * 객체를 1개만 생성해야하는 경우
 * private 생성자 사용
 * */

/*
 * 객체 생성과정
 * Person p1 = new Person();
 * 
 * 1. Person 클래스 로딩
 * 2. heap에 메모리 할당(객체 생성)
 * 3. 필드에 기본 초기값 할당
 * 4. 명시적 초기값 할당
 * 5. 생성자 실행
 * 
 * */

/*
 * 자바 공부 심화
 * 1. 이펙티브 자바
 * 2. 리팩토링
 * 3. 디자인패턴
 * 4. 엔터프라이즈 디자인패턴
 * 
 * */

public class Person {
	// 객체 생성할 때 객체 영역에 생성
	// 실제로 개발할 때는 기본값 잘 안 줌
//	String name = "홍길동"; // 필드 = 멤버 변수
//	int age = 30;

	// 기본 생성자를 컴파일러가 추가함
//	public Person() {
//	}

//	public Person(String name, int age) {
//		this.name = name; // name = name; 가장 가까운 block 내에 선언된 곳에서 찾기 때문에 둘 다 파라미터 name으로 인식되어 구분안됨.
//		this.age = age;
//		// this: 객체 참조값을 가지는 내장 변수 (박길동의 this가 가리키는 주소 != 김길동의 this가 가리키는 주소는 다르다)
//	}

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*
	 * 생성자 오버로딩의 규칙 1. 이름 동일 2. 매개변수 다름(타입 또는 순서, 갯수) - 매개변수 이름은 무관 public Person()
	 * => Person() public Person(String name) => Person_String() public
	 * Person(String name, int age) => Person_String_int()
	 * 
	 */
	public Person() {
	}

	// parameter에 두고 Ctrl+1
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(int age, String name) {
		// Constructor call must be the first statement in a constructor.
		this(name, age); // this method: 해당 객체의 생성자를 부른다.
		System.out.println();
	}

	// 중복 정의 x
//	public Person(int age2, String name2) {
//		this.age = age2;
//		this.name = name2;
//	}

	/** 내부 변수 값을 출력 */
	public void printInfo() {
		System.out.println("name:" + this.name + ", age:" + this.age);
		return;
	}

}

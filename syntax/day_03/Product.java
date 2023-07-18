package day_03;

/** 상품 기본 정보 정의용 클래스 */
public class Product {
	// 객체 소속
	String code; // 상품코드
	String name; // 상품이름
	String company; // 제조사
	int price; // 상품가격
	// 클래스 소속 정적
	static int count = 0;

	public Product(String code, String name, String company, int price) {
		super();
		this.code = code;
		this.name = name;
		this.company = company;
		this.price = price;
		count++; // 같은 영역 안에 static 변수를 찾아서 계산한다.
	}

	public void printInfo() {
		System.out.println("code=" + code + ", name=" + name + ", company=" + company + ", price=" + price);
	}

	/*
	 * static 메서드는 static 변수만 직접 접근 가능 
	 * class A{
	 * 	static int i =0;
	 * 	static void a(){
	 * 		i++;
	 * 	}
	 * }
	 * 
	 * static 메서드는 non-static 변수는 직접 접근 불가
	 * class A{
	 * 	int i = 0; // 생성시기: 누군가가 A의 객체를 생성했을 때 heap 공간에 만들어진다.
	 * 	static void a(){
	 * 		i++; // 구문 오류! 다른 메모리 공간에 올라간다.
	 * 	}
	 * }
	 * 
	 */
	// 독립적인 값 계산할 때의 용도로 많이 사용한다. (PI, log, Random 계산 등)
	public static void prn () {
		// 멤버 변수와 직접적으로 접근 불가
//		price=100; // Cannot make a static reference to the non-static field price
		count = 3; // 가능
		// price를 쓰고 싶다면 힙에 올리고 사용가능
		Product p1 = new Product("11", "11", "11", 100);
		p1.price = 200;
	}
	
	
}

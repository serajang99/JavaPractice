package syntax.day_03;


// Class는 Object의 Template이고
// Object는 Class의 Instance이다.

public class ProductExam {
	public static void main(String[] args) {
		Product p1 = new Product("a100", "냉장고", "삼성", 100); // Ctrl+1
		p1.printInfo();
//		p1.count++; // 비추 방법
		Product p2 = new Product("a100", "냉장고", "삼성", 100); // Ctrl+1
		p2.printInfo();
		
//		Product p2 = null;
//		p2.price = 100; // NullPointerError 
		System.out.println(Product.count); // 강추 방법
	}
}

package syntax.day_05;

import java.util.HashSet;
import java.util.Set;

public class SetExam {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		
		박태환선수 bt = new 박태환선수(); // 수영하기 공던지기 둘 다 있음
		
		수영선수 s1; // 수영하기만 있음
		s1 = bt;
		
		
		야구선수 b1; // 공던지기만 있음
		b1 = bt;
		
	}
}

interface 수영선수 {
	public void swimming();
}

interface 야구선수 {
	public void 공던지기();
}

class 박태환선수 implements 수영선수, 야구선수 {
	@Override
	public void swimming() {
		System.out.println("수영하기");
	}

	@Override
	public void 공던지기() {
		System.out.println("공던지기");
	}
}

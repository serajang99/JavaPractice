package day_05;

import java.util.Comparator;

public class NameComparator implements Comparator<MyMember> {

	@Override
	public int compare(MyMember o1, MyMember o2) {
		return o2.getName().compareTo(o1.getName()); // 문자열 계산 compareTo
	}

}

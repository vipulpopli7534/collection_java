package collection;

import java.util.*;

public class setcompare {

	public static void main(String[] args) {
		Set s=new HashSet();
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		s.add("E");
		Set s1=new HashSet();
		s1.add("A");
		s1.add("B");
		s1.add("C");
		s1.add("D");
		s1.add("E");
		if(s1.containsAll(s)) {
			System.out.println("Both sets are Equal");
		}
			
	}
}

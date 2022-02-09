package set;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add("hs");
		hs.add(1.0);
		hs.add("100");
		hs.add(100);
		hs.add(10);
		hs.add(5.4);
		
		System.out.println(hs);
	}
}

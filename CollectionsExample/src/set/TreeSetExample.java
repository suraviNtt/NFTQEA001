package set;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet tree = new TreeSet();
		tree.add(100);
		tree.add(10);
		tree.add(103);
		tree.add(100);
		
		System.out.println(tree);
	}
}

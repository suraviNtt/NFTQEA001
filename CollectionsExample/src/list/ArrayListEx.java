package list;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Object> a = new ArrayList<Object>();
		a.add("1000");
		a.add(10);
		a.add("pakija");
		a.add(10.2);
		
		System.out.println(a);
		
		
		//for each example
		for(Object obj : a) {
			System.out.print(obj);
			System.out.print(" ");
		}
		
		a.remove(1);
		
		
		System.out.println(a);
	}
}

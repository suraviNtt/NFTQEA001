package list;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> strlist = new LinkedList<String>();
		strlist.add("Suravi");
		strlist.add("Pakija");
		
		System.out.println(strlist);
		
	   Collections.sort(strlist);
	   
	   System.out.println(strlist);
	   
	}
}

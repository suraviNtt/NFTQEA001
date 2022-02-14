package demo;

public class ABC {

	public static void main(String[] args) {
		
		int i = 10;
		
		System.out.println(i++); //10
		System.out.println(++i); //12
		System.out.println(i--); //12
		System.out.println(--i); //10
		System.out.println(i); //10
		
		int y = i++ + i-- + i++ + ++i;
		System.out.println(i); //12
		System.out.println(y); //43
		System.out.println(y--); //43
		System.out.println(y); //42
		
	}
}

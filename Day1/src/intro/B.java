package intro;

public class B extends A {

	public static void main(String[] args) {
		A a = new A();
		a.test();
		
		B b = new B();
		b.test();
		
		A a1 = new B();
		a1.test();
		
	}
	
	public void test() {
		System.out.println("Test B");
	}
	
	public void test(int i) {
		System.out.println("Test B2 "+i);
	}
	
}

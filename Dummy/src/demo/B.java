package demo;

public class B extends A implements D {

	final public void test() {
		System.out.println("Test B");
	}
	public static void main(String[] args) {
		A a = new B();
		a.test();
	}
	@Override
	public void xyz() {
		// TODO Auto-generated method stub
		
	}
	
}

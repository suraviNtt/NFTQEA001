package intro;

public class A {

	 int i =10;
	
	public void test() {
		System.out.println("Test");
	}
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.i);
		a.test();
	}
}

package inheritane;

public class B extends A{
	
	public void bTest() {
		System.out.println("B Test");
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		System.out.println(b.i);
		System.out.println(b.c);
		System.out.println(b.j);
	}
}

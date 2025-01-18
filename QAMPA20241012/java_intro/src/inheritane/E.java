package inheritane;

public class E extends A{
	
	public void test() {
		System.out.println("Test E");

	}
	
	public static void main(String[] args) {
		
		E e = new E();
		e.test();
		
		A a = new A();
		a.test();
		
		A a1 = new E();
		a1.test();   // Overridden  - run time polymorphism 
		
	}

}

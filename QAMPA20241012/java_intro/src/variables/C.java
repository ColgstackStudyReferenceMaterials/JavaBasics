package variables;

import access_specifiers.A;

public class C {

	public void test() {
		System.out.println("Test C");

	}

	protected void testPro() {
		System.out.println("TestPro C");
	}

	void testV() {
		System.out.println("TestV C");
	}

	private void testPri() {
		System.out.println("TestPri C");
	}

	public static void main(String[] args) {
		
		A a = new A();
		a.test();
		System.out.println(a.d);
	}
}

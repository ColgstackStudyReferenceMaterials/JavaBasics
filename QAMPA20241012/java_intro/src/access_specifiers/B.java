package access_specifiers;

public class B {
	private int e = 10;
	protected int f = 20;
	int g = 10;
	public int h = 20;

	public void test() {
		System.out.println("Test B");

	}

	protected void testPro() {
		System.out.println("TestPro B");
	}

	void testV() {
		System.out.println("TestV B");
	}

	private void testPri() {
		System.out.println("TestPri B");
	}

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		System.out.println(a.b);
		a.testPro();

	}

}


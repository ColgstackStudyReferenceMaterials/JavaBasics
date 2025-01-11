package access_specifiers;

public class A {

	private int a = 10;
	protected int b = 20;
	int c = 10;
	public int d = 20;

	public void test() {
		System.out.println("Test A");

	}

	protected void testPro() {
		System.out.println("TestPro A");
	}

	void testV() {
		System.out.println("TestV A");
	}

	private void testPri() {
		System.out.println("TestPri A");
	}

	public static void main(String[] args) {
		A a = new A();
		a.testPri();
		System.out.println(a.a);

	}

}

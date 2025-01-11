package variables;

import access_specifiers.A;

public class D extends A{

	
	public static void main(String[] args) {
		
		A a = new A();
		D d = new D();
		System.out.println(d.b);
		int n = d.d;
		System.out.println(n);
		d.test();
		d.testPro();
	}
}

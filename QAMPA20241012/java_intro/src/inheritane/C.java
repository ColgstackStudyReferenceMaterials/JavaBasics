package inheritane;

public class C extends B{
	
	public void cTest() {
		System.out.println("C Test");
	}

	public static void main(String[] args) {
		
		C c = new C();
		int aObj = c.i;
		c.bTest();
		System.out.println(aObj);
	}
}

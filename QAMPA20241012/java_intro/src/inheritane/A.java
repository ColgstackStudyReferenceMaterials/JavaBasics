package inheritane;

public class A {

	int i = 10;
	int j = 20;
	int c = i + j;

	public int sub (int a , int b) {
		if(a>b) {
			return a-b ;
		}
		else {
			return b-a ;
		}
	}

	public void test() {
		System.out.println("Test A");

	}
	
	public void test(int i) {
		System.out.println("Test = "+i);
	}
	
	public void test(int i ,String text) {
		System.out.println("Test = "+i + " "+ text);
	}
	
	public void test(float i) {
		System.out.println("Test float= "+i);
	}
	
	public void test(String i) {
		System.out.println("Test text= "+i);
	}
	
	public static void main(String[] args) {
		
		A a = new A();
		
	}
}

package inheritane;

public class Parent1 {

	int i =10;
	int j = 20;
	int c = i+j;
	
	public int sub (int a , int b) {
		if(a>b) {
			return a-b ;
		}
		else {
			return b-a ;
		}
	}
	
}

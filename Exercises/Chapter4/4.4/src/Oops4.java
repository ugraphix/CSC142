
public class Oops4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 7;
		int b=42;
		int smaller = minimum (a,b);
		if (smaller ==a) {
			System.out.println("a is the smallest!");
			
		}else {
			System.out.println("b is the smallest");
		}

	}
	
	public static int minimum (int a, int b) {
		int smaller;
		if(a<b) {
			smaller = a;
		}else {
			smaller = b;
		}
		return smaller;
	}
	

}


public class NumberTriangle {

	public static void main(String[] args) {
		
		padString("hello",10);
		
		
		
		// TODO Auto-generated method stub
		for (int i = 1; i<=7; i++){
			for (int j=1; j<=i; j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	{ 
		 
			System.out.println( padString( "hello", 8) + "END" ); 
			System.out.println( padString( "Congratulations", 10)); 
			} 
			public static String padString(String s, int n) 
			{ 
			for(int i = s.length(); i<n; i++) 
			s+=" "; 
			return s; 
			}
		 
	}


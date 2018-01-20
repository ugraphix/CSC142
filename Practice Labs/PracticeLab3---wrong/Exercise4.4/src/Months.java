
public class Months {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		daysInMonth(9);
		
	}
	
	public static int daysInMonth (int month) {
		int days;
		if (month==2) {
			days=28;
		}else if (month==4 ||month==6||month==6||month==9||month==11){
		days = 30;
		}else { 
			days=31;
			
		}
		System.out.println(days);
		return days;
		
	}

}

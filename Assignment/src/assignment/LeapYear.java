package assignment;

public class LeapYear {
	
	public static boolean leapYear(int year) {
		if(year%4==0 && year%100==0 && year%400==0 ) {
			return true;
		}
		if(year%4==0 && !(year%100==0)){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int year=2012;
		System.out.println(LeapYear.leapYear(year));

	}

}

package assignment;

public class Palindrome {
	
	public static boolean isPalindrome(String s) {
		String reverse="";
		for(int i=s.length()-1;i>-1;i--) {
			reverse=s.charAt(i)+reverse;
		}
		if(reverse.equals(s)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		String val="121";
		System.out.println(Palindrome.isPalindrome(val));

	}

}

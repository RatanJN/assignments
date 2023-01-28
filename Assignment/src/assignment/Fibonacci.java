package assignment;

public class Fibonacci {
	public static long fibNumber(long number) {
		if(number<=1) {
			return number;
		}
		return fibNumber(number-1)+fibNumber(number-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<101;i++) {
			System.out.println("The fibonnaci value for "+i+" is "+Fibonacci.fibNumber(i));
		}

	}

}

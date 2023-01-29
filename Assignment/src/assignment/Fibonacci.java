package assignment;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	public static long fibNumber(long number) {
		if(number<=1) {
			return number;
		}
		return fibNumber(number-1)+fibNumber(number-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Long> seq=new ArrayList<>();
		for(int i=0;i<101;i++) {
			seq.add(Fibonacci.fibNumber(i));
		}
		System.out.println(seq);
	}

}

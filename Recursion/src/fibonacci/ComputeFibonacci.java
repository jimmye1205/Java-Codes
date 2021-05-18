package fibonacci;
import java.util.Scanner;
public class ComputeFibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an index for a Fibonacci number: ");
		int index = in.nextInt();
		
		System.out.println("The Fibonacci number index " + index + " is " + fib(index));
	}
	
	public static long fib(long index) {
		if(index == 0) 
			return 0;
		else if(index == 1) 
			return 1;
		else 
			return fib(index - 1) + fib(index - 2);
	}
}

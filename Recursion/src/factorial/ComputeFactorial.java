package factorial;
import java.util.*;
public class ComputeFactorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a nonnegative integer: ");
		int n = in.nextInt();
		System.out.println("Factorial of " + n + " is " + factorial(n));
	}
	public static long factorial(int n) {
		if(n == 0)
			return 1;
		else
			return n * factorial(n - 1);
	}
}

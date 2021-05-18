package homework3_Recursion;
import java.util.*;
public class basicString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		System.out.println("enter something ");
		String user = in.next();
		System.out.println(user);
		System.out.println(user.length());
		for(int i = random.nextInt(user.length()); i < user.length();) {
			user.charAt(i);
			System.out.println(user.charAt(i));
		}
	}
}

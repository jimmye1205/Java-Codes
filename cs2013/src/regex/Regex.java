package regex;
import java.io.*;
import java.util.*;
public class Regex {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a file path: ");
		String Path = in.next();
		File file = new File(Path);
		Scanner sc = new Scanner(file);
		int john = 0;
		int jo = 0;
		while(sc.hasNextLine()) {
			
			for(String word: sc.nextLine().split(" ")) {
				if(word.matches("John")) {
					john++;
					System.out.println("John - count:" + john);
				}
				else if(word.startsWith("Jo")) {
					jo++;
					System.out.println("Jo - count:"+ jo);
				}
				else if(sc.hasNextLine()) {
					
				}
			}
		}	
	}
}



//  C:\Users\jimmy\OneDrive\Desktop\R&J.txt
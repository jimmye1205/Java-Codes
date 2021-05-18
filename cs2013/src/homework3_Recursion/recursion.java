package homework3_Recursion;
import java.util.*;
import java.io.*;
public class recursion {
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
		ArrayList<String> anagram = new ArrayList<String>();
		anagram.add("abc");
		anagram.add("Jimmy");
		anagram.add("Hello Welcome to Java.");
		
		
		for(int i = 0; i < anagram.size(); i++) {
			//returns string
			System.out.print(anagram.get(i));
			//returns number 
			System.out.println(" - " + i);
		
		}
		
	}
//	public void parsing() {
//		//create valid word file of a list of strings
//	}
//	private void anagramize(String inString) {
//		System.out.println("input string: " + inString);
//		List<String> l = filter(anagramizeRecursive(inString.toLowerCase()));
//		System.out.println("Anagrams: " + l );
//	}
//	public String anagramizeRecursive(ArrayList<String> stringList) {
//		//contains loop to generate each possible substring
//		for(int i = 0; i < stringList.length(); i++) {
//			return i;
//		}
//		return null;
//		
//	}
//	public void nonRecursiveFilter() {
//		
//	}
//	public void recursiveFilter() {
//		
//	}
}

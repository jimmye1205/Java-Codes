package recursion;

import java.util.ArrayList;
import java.util.List;

public class CountRecursionList {
	public static void main(String[] args) {
		ArrayList<String> hello = new ArrayList<String>();
		hello.add("hello");
		hello.add("my");
		hello.add("name");
		hello.add("is");
		hello.add("Jimmy Hernandez");
		
		int wordCount = countWord(hello);
		System.out.println(wordCount);
	}
	public static int countWord(List<String> words) {
		int n = 0;
		if (countWord(words) == 0) {
			return n;
		} 
		String word = words.get(1);
		n = word.length();
		if(countWord(words) > n) {
			return countWord(words.subList(0, n));
			
		}
		else
			return countWord(words.subList(0, n));
	
	}	
}

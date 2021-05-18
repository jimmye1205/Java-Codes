package recursion;
import java.util.*;
public class RecursionList {
	public static void main(String[] args) {
		ArrayList<String> hello = new ArrayList<String>();
		hello.add("hello");
		hello.add("my");
		hello.add("name");
		hello.add("is");
		hello.add("Jimmy Hernandez");
		int n = longest(hello);
	//	String m = stringList(hello);
		System.out.println(n);
	}
	public static int longest(List<String> arr) {
		int n = 0;
		if (arr.size() == 0) {
			return n;
		} 
		String word = arr.get(0);
		n = word.length();
		
		if(n > longest(arr.subList(1, arr.size()))) {
			return n;
		}
		else 
			return longest(arr.subList(1, arr.size()));
	}
//	private static List<String> stringList(List<String> listOfWords){
//	List<String> bigWord = null;
//	List<String> longestWord;
//	int n = 0;
//	
//	if(listOfWords.isEmpty()) 
//		return null;
//		
//	if(listOfWords.size() > 0) 
//		bigWord = listOfWords.subList(0, n+1);
//		n++;
//		longestWord = listOfWords.subList(n, listOfWords.size());
//	
//		if(longestWord.size() > bigWord.size())
//		return longestWord;
//		
//		else
//			return stringList(longestWord);	
//}

}

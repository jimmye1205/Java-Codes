package Generics;
import java.util.*;
public class Generics {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList();
		names.add("Joe");
		names.add("Brandon");
		names.add("Pete");
		
		String joe = getByIndex(names,0);
		String brandon = getByIndex(names,1);
		String pete = getByIndex(names,2);
		
		System.out.println(joe);
		System.out.println(brandon);
		System.out.println(pete);
		
		System.out.println(contains(names,"Joe"));
		char getFirst = getFirstIndexOfEqualObject(names, "Pete");
		
	}
	public static <E> E getByIndex(List<E> eList, int i) {
		if(i >= eList.size()) return null;
		return eList.get(i);
	}
	
	public static <E> boolean contains(List<E> eList, E e) {
		if(eList.contains(e)) {
			return true;
		}else {
			return false;
		}
	}
//	Write a method called getFirstIndexOfEqualObject,
//	which takes a List<E> and an E, 
//	returns the first index where the E or an object equal to it 
//	according to the .equals() method can be found in the list. 
//	If no object equal to the key can be found, the method should return -1.
	public static <E> char getFirstIndexOfEqualObject(List<E> eList, E e) {
		if(eList.contains(e)) {
			char firstIndex = e.toString().charAt(0);
			System.out.println(firstIndex);
		}
		else
			System.out.print(-1);
		return 0;
	}
}

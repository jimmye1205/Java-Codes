package Stacks;
import java.util.*;

public class Stacks<T> {
	public static void main(String[] args) {
		System.out.print("Insert a balanced parenthesis: ");
		GenericStack<String> stringStack = new GenericStack<String>();
		stringStack.push("[");
		stringStack.push("{");
		stringStack.push("(");
		stringStack.push(")");
		stringStack.push("}");
		stringStack.push("]");
		
		System.out.println(stringStack.pop());
		System.out.println(stringStack.pop());
		System.out.println(stringStack.pop());
	}
//	public static <T> boolean isBalanced(GenericStack<String> stringStack) {
//		int letterAt = 0;
//		if(stringStack.equals(0)) {
//			return true;
//		}
//		else
//			while(letterAt != (stringStack.size()-1)) {
//				if() {
//					
//				}
//				
//				
//					letterAt++;
//			}
//		return false;
//	}
}

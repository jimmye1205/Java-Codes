package Stacks;
import java.util.*;

public class GenericStack<T> {
	private ArrayList<T> stack = new ArrayList<T>();
	private int top = 0;
	
	public int size() {
		return top;
	}
	public void push(T item) {
		stack.add(top++, item);
	}
	public T pop() {
		return stack.remove(--top);
	}
}

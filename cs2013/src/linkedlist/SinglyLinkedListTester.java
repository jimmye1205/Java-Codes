
package linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;



public class SinglyLinkedListTester {
	
	
	 static<T> boolean hasLoop(Node<T> loopHere) {
		if(loopHere == null) 
			return false;
		
		Node<T> first, end;
		
		first = end = loopHere;
		
		while(true) {
			
			first = first.getNext();
			if(end.getNext() == null) 
				end = null;
		
			else	
				end = end.getNext().getNext();
			if(end == null)
				return false;
			
	    	if(first == end)
	    		return true;
		}
	}
	

	
	@Test
	public void noNodes() {
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		assertNotNull(list);
	}
	
	@Test
	public void nodesNoCycle() {
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		String testString = "Godzilla";
		String testString2 = "Ghidora";
		String testString3 = "Mothra";
		list.add(testString);
		list.add(testString2);
		list.add(testString3);
		assertEquals(list.size(), 3);
	}
	
	@Test
	public void oneNodeCycle() {
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		String testString = "Godzilla";
		list.add(testString);
		assertEquals(list.get(0) , testString);
	}
	
	@Test
	public void oddNodeCycle() {
		SinglyLinkedList<String> nodes = new SinglyLinkedList<String>();
		String testString = "Godzilla";
		String testString2 = "Mothra";
		String testString3 = "Ghidora";
		nodes.add(testString);
		nodes.add(testString2);
		nodes.addToCreateCycle(testString3);
		boolean cycle = true; 
		assertEquals(hasLoop(nodes.getNode(0)), cycle);
		assertEquals(nodes.size(), 3);
	}
	
	@Test
	public void evenNodeCycle() {
		SinglyLinkedList<String> nodes = new SinglyLinkedList<String>();
		String testString = "Godzilla";
		String testString2 = "Mothra";
		String testString3 = "Ghidora";
		String testString4 = "King Kong";
		nodes.add(testString);
		nodes.add(testString2);
		nodes.add(testString3);
		nodes.addToCreateCycle(testString4);
		boolean cycle = true;
		assertEquals(hasLoop(nodes.getNode(0)), cycle);
		assertEquals(nodes.size(), 4);
	}
}	

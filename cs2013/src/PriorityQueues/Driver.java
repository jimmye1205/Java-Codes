package PriorityQueues;
import java.util.*;
public class Driver {
	public static void main(String[] args) {
		PriorityQueue<Victims> queue = new PriorityQueue<Victims>();
		queue.offer(new Victims("Murgatroyd", 89, 5));
		queue.offer(new Victims("Jimmy", 100, 7));
		queue.offer(new Victims("Timmy", 111, 8));
		queue.offer(new Victims("Oscar", 70, 9));
		queue.offer(new Victims("Tommy", 120, 6));
		queue.offer(new Victims("Bravo", 100, 9));
		queue.offer(new Victims("Delta", 99, 7));
		
		while(!queue.isEmpty()) {
			
			System.out.println(queue.remove());
		
		}
	}
}

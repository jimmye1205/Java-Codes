package Midterm;
import java.util.*;
public class Driver {
	public static void main(String[] args)  {
		System.out.println("It's a new day on Mt. Desperation!");
		int[] climber = {1,2,3};
		Stack<Climber> climbers = new Stack<Climber>();
		Climber name = new Climber("Barney");
		Climber name2 = new Climber("Betty");
		Climber name3 = new Climber("Ethel");
		Climber name4 = new Climber("Fred");
		Climber name5 = new Climber("John");
		Climber name6 = new Climber("Juliet");
		Climber name7 = new Climber("Romeo");
		Climber name8 = new Climber("Wilma");
		Climber name9 = new Climber("Zelda");
		
		climbers.push(name);
		climbers.push(name2);
		climbers.push(name3);
		climbers.push(name4);
		climbers.push(name5);
		climbers.push(name6);
		climbers.push(name7);
		climbers.push(name8);
		climbers.push(name9);
		System.out.println(name.getName() + " lines up");
		System.out.println(name2.getName()+ " lines up");
		System.out.println(name3.getName()+ " lines up");
		System.out.println(name4.getName()+ " lines up");
		System.out.println(name5.getName()+ " lines up");
		System.out.println(name6.getName()+ " lines up");
		System.out.println(name7.getName()+ " lines up");
		System.out.println(name8.getName()+ " lines up");
		System.out.println(name9.getName()+ " lines up");
		
		System.out.println("Yetti throws " + name.getName() + " into the cave!");
		System.out.println("Yetti throws " + name2.getName() + " into the cave!");
		System.out.println("Yetti throws " + name3.getName() + " into the cave!");
		System.out.println("Yetti throws " + name4.getName() + " into the cave!");
		System.out.println("Yetti throws " + name5.getName() + " into the cave!");
		System.out.println("Yetti throws " + name6.getName() + " into the cave!");
		System.out.println("Yetti throws " + name7.getName() + " into the cave!");
		System.out.println("Yetti throws " + name8.getName() + " into the cave!");
		System.out.println("Yetti throws " + name9.getName() + " into the cave!");
		
		int route = 0;
		while(!climbers.isEmpty()) {
			System.out.println(climbers.pop().getName() + " escapes from the cave and slides +"
					+ "down the descent route " + route%climber.length);
			route++;
		}
	}
}

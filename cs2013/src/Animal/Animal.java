package Animal;
import java.util.Random;

public abstract class Animal {
	Random r = new Random(1);
	
	protected double health = 1.0;
	protected double accuracy;
	protected double power;
	protected String name;
	
	public boolean isAlive() {
		if(this.health > 0) {
			return true;
		}
		else 
			return false;
	}
	
	
	public void receiveInjury(double d) {
		health -= d;
		System.out.println("The animal "+ getName() + " received " + d + " amount of damage.");
		if(this.health == 0 || this.health < 0) {
			System.out.println("The animal "+ getName() + " has 0 amount of health and is now dead");
		}
		else
			System.out.println("The animal "+ getName() + " has " + this.health + " amount of health left.");
	}
	
	
	public void attack(Animal target) {
		
		System.out.println(this.getName() + " is attacking " + target.getName());
		double rand = r.nextDouble();
		
		
		if(rand < accuracy){
		 target.receiveInjury(this.power);
		} 
		else
		System.out.println(this.getName() + " attacks " + target.getName() + " and misses.");
	}
	public String getName() {
		return this.name;
	}
}

package hw5;

public abstract  class Predator extends Animal {
	public Predator(double weight, String name) {
		super(weight, name);
	}
	abstract public String predate();
	abstract public String call();
	
	public String toString() {
		return "The predator came up to the prey " + predate() + " " + call();
	}
}

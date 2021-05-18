package hw5;

public abstract class Prey extends Animal {

	public Prey(double weight, String name) {
		super(weight, name);
	}
	abstract public String flee();
	abstract public String call();
	
	@Override
	public String toString() {
		return "The prey " + flee() + " away and made a " + call() + " kind of noise";
	}
}
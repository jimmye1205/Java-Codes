  package hw5;

public abstract class Animal {
	protected double weight;
	protected String name;
	
	public Animal(double weight, String name) {
		this.weight = weight;
		this.name = name;
	}
/*
	public double eat(double eat) {
	}
*/
	abstract public String call();
	abstract public String flee();
	abstract public String predate();
	
	}

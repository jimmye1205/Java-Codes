package Animal;
import java.util.Random;
public class HorseSizedDuck extends Animal{
	Random random1 = new Random();
	
	private double health = 1.0;
	private double accuracy;
	private double power;
	private String name;
	
	public HorseSizedDuck(double health, double accuracy, double power, String name) {
		
		this.health = health;
		this.accuracy = accuracy;
		this.power = power;
		this.name = name;
	}

	

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public double getAccuracy() {
		double wind = random1.nextDouble();
		accuracy = 0.1/wind;
		double round1 = Math.round(accuracy * 100) / 100.00;
		return round1;
	}

	public void setAccuracy(double accuracy) {
		this.accuracy = accuracy;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "HorseSizedDuck named " + name + " created with power  = " + getPower() + " and accuracy = " + getAccuracy();
	}
}

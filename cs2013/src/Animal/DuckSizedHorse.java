package Animal;
import java.util.Random;
public class DuckSizedHorse extends Animal{
	Random random2 = new Random();
	
	private double health = 1.0;
	private double accuracy;
	private double power;
	private String name;
	
	public DuckSizedHorse(double health, double accuracy, double power, String name) {
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
		return accuracy;
	}

	public void setAccuracy(double accuracy) {
		this.accuracy = accuracy;
	}

	public double getPower() {
		double rain = random2.nextDouble();
		power = 0.1/rain;
		double round2 = Math.round(power * 100) / 100.00;
		return round2;
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
		return "DuckSizedHorse named " + name + " created with power  = " + getPower() + " and accuracy = " + getAccuracy();

	}
}

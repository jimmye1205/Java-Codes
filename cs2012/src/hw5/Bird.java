package hw5;

public class Bird extends Prey{
	public Bird(double weight, String name) {
		super(weight, name);
	}

	@Override
	public String call() {
		return "tweet tweet";
	}

	@Override
	public String flee() {
		return "flap flap flap";
	}
	@Override
	public String predate() {
		return null;
	}
}

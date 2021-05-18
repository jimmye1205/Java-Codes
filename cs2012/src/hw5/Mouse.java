package hw5;

 public class Mouse extends Prey{
	
	public Mouse(double weight, String name) {
		super(weight, name);
	}

	@Override
	public String call() {
		return "sqeak sqeak";
	}
	@Override
	public String flee() {
		return "scurry scurry scurry";
	}
	@Override
	public String predate() {
		return null;
	}
}

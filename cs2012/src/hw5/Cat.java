package hw5;

public class Cat extends Predator {
	
	public Cat(String name, double weight) {
		super(weight, name);
	}
	

	@Override
	public String call() {
		return "Meow";
	}
	
	@Override
	public String predate() {
		return "hiss hiss";
	}


	@Override
	public String flee() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

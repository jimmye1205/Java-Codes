package shape3D;

public abstract class shape3D {
	protected double volume;

	public boolean isLargerThan(shape3D shape) {
		if(shape.getVolume(volume) > shape.getVolume(getEquivalentCube())) {
		return true;
	}
		else
			return false;
	}
	public double getVolume(double volume) {
		return volume;
	}
	public double shape3D() {
		return volume;
	}
	abstract public double getEquivalentCube();
}

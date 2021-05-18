package shape3D;

public class cube extends shape3D{
	private double side;
	private double cubeVolume;
	
	public cube(double side) {
		this.side = side;
		cubeVolume = Math.pow(side, 3);
	}
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getEquivalentCube() {
		// TODO Auto-generated method stub
		return cubeVolume;
	}
	public void setVolume(double cubeVolume) {
		cubeVolume = volume;
	}
	
	public String toString() {
		return "Cube with side " + side + " and volume " + cubeVolume;
	}
	
}

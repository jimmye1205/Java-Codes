package shape3D;

public class sphere extends shape3D{
	private double radius;
	private double sphereVolume;

	public sphere(double radius) {
		
		this.radius = radius;
		sphereVolume = (4/3) * (Math.PI) * (Math.pow(radius, 3)); 
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getEquivalentCube() {
		return sphereVolume;
	}
	public void setVolume(double sphereVolume) {
		sphereVolume = volume;
	}
	public String toString() {
		return "Sphere with radius " + radius + " and volume " + sphereVolume;
	}
}

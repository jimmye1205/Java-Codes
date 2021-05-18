package ch13_1;

public class circle extends geometricobject {
	private double radius;

     
     public circle(double radius, String color, boolean filled) {
    	 super(color, filled);
    	 this.radius = radius;
    	 
     }
    
    public double getRadius() {
    	return radius;
    }
    public void setRadius() {
    	this.radius = radius;
    }
    public double getDiameter() {
    	return 2 * radius;
    }
	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}
	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	public String toString() {
		return super.toString() + "\nRadius: " + radius + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
}

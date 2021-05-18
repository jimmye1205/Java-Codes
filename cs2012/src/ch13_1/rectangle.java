package ch13_1;

public class rectangle {
	private double width;
	private double height;
	
	public rectangle(double width, double height, String color, boolean filled) {
		super();
		this.width = width;
		this.height = height;
	}
	/** Return width */
	public double getWidth() {
		return width;
	}

	/** Set a new width */
	public void setWidth(double width) {
		this. width = width;
	}

	/** Return height */
	public double getheight() {
		return height;
	}

	/** Set a new height */
	public void setheight(double height) {
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width * height);
	}

	@Override /** Return String description of this rectangle */
	public String toString() {
		return super.toString() + "\nWidth: " + width + "\nHeight: " + height
			+ "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
}

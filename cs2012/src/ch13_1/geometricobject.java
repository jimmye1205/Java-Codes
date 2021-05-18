package ch13_1;

public abstract class geometricobject implements Comparable<geometricobject>{
	protected String color;
	protected boolean filled;
	protected java.util.Date dayCreated;
	
	protected geometricobject(String color, boolean filled) {
		dayCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public java.util.Date getDayCreated(){
		return dayCreated;
	}
	public String toString() {
		return "Color: " + color + "\nFilled: " + filled + "\nDay Created " + dayCreated;
	}
	
	public int compareTo(geometricobject o) {
		if(this.getArea() > o.getArea())
			return 1;
		else if(this.getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	
	public geometricobject max(geometricobject o1, geometricobject o2) {
		return o1.compareTo(o2) == 1 ? o1 : o2;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
}

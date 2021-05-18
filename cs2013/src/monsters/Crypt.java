package monsters;

public class Crypt {
	private String location;
	
	public Crypt(String location) {
		this.location = location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocation() {
		return location;
	}
	public String toString() {
		return "A mysterious crypt in " + location;
	}
}

package PriorityQueues;

public class Victims implements Comparable<Victims> {
	String name;
	int iq;
	int appearance;
	
	public Victims(String n, int i, int a) {
		name = n;
		iq = i;
		appearance = a;
	}
	public String getName() {
		return name;
	}
	public int getIQ() {
		if(iq > 200)
			return iq = 200;
		else if(iq < 50) {
			return iq =50;
		}
		return iq;
	}
	public int getAppearance() {
		if(appearance > 10)
			return appearance = 10;
		else if(appearance < 1) {
			return appearance =1;
		}return appearance;
	}
	public String toString() {
		return name + ": intelligence " + iq + ", appearance " + appearance ;
	}
//	public int compareTo(Victims brains) {
//		return iq.equals(brains.getIQ());
//	}
	@Override
	public int compareTo(Victims o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

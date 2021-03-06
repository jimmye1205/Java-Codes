package monsters;

public class Vampire implements Monsters, Cloneable{
	private String name;
	private Crypt crypt;
	
	public Vampire(String name, String location) {
		this.name = name;
		crypt = new Crypt(location);
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setLocation(String location) {
		crypt.setLocation(location);
	}
	@Override
	public String getLocation() {
		return crypt.getLocation();
	}
	@Override
	public String getOriginStory() {
		return "Undead creature which lives by sucking the blood of living humans";
	}
	
	@Override
	public void rapage() {
		StringBuilder sb = new StringBuilder(name 
				+ " arises from " + crypt.toString() + " and ");
		if(crypt.getLocation().equals("Transylvania")) {
			sb.append("sucks people's blood all night, then returns to a coffin to hide from sunlight");
		}
		else if(crypt.getLocation().equals("Burbank")) {
			sb.append("takes over the entire television industry");
		}
		else {
			System.out.println("wreaks unknown havoc in fresh Vampire territory");
			return;
		}
		System.out.println(sb);
	}
	public Crypt getCrypt() {
		return crypt;
	}
	@Override
	public Object clone() {
		Vampire newV;
		try {
			/*Object clone() returns an Object. It will be a Vampire but in order to get to anything specific
			 * to Vampires, we need to cast it to a Vampire reference variable
			 */
			newV = (Vampire) super.clone();
			newV.crypt = new Crypt(crypt.getLocation());	
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
		return newV;
	}
	
}
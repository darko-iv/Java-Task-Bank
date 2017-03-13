package bank;

public class Account {
	String name;
	String ID;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public Account(String name, String iD) {
		super();
		this.name = name;
		ID = iD;
	}
	
	public String toString() {
		return "" + name + " " + ID;
	}
	
	

}

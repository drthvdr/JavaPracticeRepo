package Inheritance;

public class Cat extends Animal{
	private String name;
	private boolean neutured;
	
	public Cat ( int weight, String name, boolean neutered ) {
		super(weight);
		setName(name);
		setNeutured(neutered);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isNeutured() {
		return neutured;
	}

	public void setNeutured(boolean neutured) {
		this.neutured = neutured;
	}
	
	public String toString() {
		String result;
		result = "Cat Name: " + name + " Neutered: " + neutured + " Weight: " + super.getWeight();
		return result;
	}

}

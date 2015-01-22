package Inheritance;

public class Dog extends Animal{
	
	private String name;
	
	public Dog(int weight, String name) {
		super(weight); //calling the parent constructor
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		String result;
		result = "Dog Name: " + name + " Weight: " + super.getWeight();
		return result;
	}
}

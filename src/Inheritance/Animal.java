package Inheritance;

public class Animal {
	
	private int weight;
		
	public Animal ( int weight) {
		setWeight(weight);
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String toString() {
		String result;
		result = "Animal weighing: " + weight;
		return result;
	}
}

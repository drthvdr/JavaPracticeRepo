package Inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		
		Dog yoda = new Dog(20, "Yoda");
		yoda.setName("Master Yoda");
		yoda.setWeight(22);
		
		Cat ani = new Cat (13, "Ani", true);
		
		System.out.println(yoda);
		System.out.println(ani);
		
		Animal pet;
		pet = ani;
		System.out.println(pet);
		pet = yoda;
		System.out.println(pet);
		
	}

}


public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println("Gorilla has thrown something!");
		energy -= 5;
	}
	
	public void eatBananas() {
		System.out.println("Gorilla is happy to eat a banana.");
		energy += 10;
	}
	
	public void climb() {
		System.out.println("Gorilla has climbed a tree.");
		energy -= 10;
	}

}

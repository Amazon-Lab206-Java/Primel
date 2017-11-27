
public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println("The Gorilla threw something at you!");
		this.energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("The Gorilla is eating some Bananas. Yum!");
		this.energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("The Gorilla is climbing a tree.");
		this.energyLevel -= 10;
	}
		
}

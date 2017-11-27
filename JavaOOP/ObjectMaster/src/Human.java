
public class Human {
	public int health = 100;
	public int strength = 3;
	public int stealth = 3;
	public int intelligence = 3;
	
	public void attack(Human human) {
		human.health -= this.strength;
	}
	
	public void displayInfo() {
		System.out.println("Health: " + health);
		System.out.println("Strength: " + strength);
		System.out.println("Stealth: " + stealth);
		System.out.println("Intelligence: " + intelligence);
	}
}

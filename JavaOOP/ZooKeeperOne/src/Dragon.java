
public class Dragon extends Mammal {
	public Dragon() {
		this.energyLevel = 300;		
	}
	
	public void fly() {
		System.out.println("The Dragon has taken flight!");
		this.energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("The dragon is snacking on a human - aaahhhh!");
		this.energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("The dragon has torched a town!");
		this.energyLevel -= 100;
	}
}

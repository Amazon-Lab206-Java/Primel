
public class Samurai extends Human{
	public int counter = 0;
	
	public Samurai() {
		this.health = 200;
		counter++;
	}
	
	public void deathBlow(Human human) {
		human.health = 0;
		this.health /= 2;
	}
	
	public void meditate() {
		this.health *= health/2;
	}
	
	public int howMany() {
		return counter;
			
	}
}


public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h = new Human();
		Human hu = new Human();
		Wizard w1 = new Wizard();
		Ninja n1 = new Ninja();
		Samurai s1 = new Samurai();
		Samurai s2 = new Samurai();
		
		h.attack(hu);
		hu.displayInfo();
		
		n1.steal(w1);
		w1.displayInfo();
		w1.fireball(n1);
		n1.displayInfo();
		s1.deathBlow(n1);
		n1.displayInfo();
		s1.displayInfo();
		w1.heal(s2);
		s2.displayInfo();
		s1.howMany();
		
		
	}

}

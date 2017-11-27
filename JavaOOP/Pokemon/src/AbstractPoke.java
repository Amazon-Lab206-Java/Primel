
public abstract class AbstractPoke implements PokeInterface {
	
	public Pokemon createPokemon(String name, String type, int health) {
		return new Pokemon(name, health, type);
	}
	
	public void attackPokemon(Pokemon p){
		int currentHealth = p.getHealth() - 10;
		p.setHealth(currentHealth);
	}
}

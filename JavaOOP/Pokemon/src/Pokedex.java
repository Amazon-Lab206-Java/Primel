
public class Pokedex extends AbstractPoke {
	public String pokemonInfo(Pokemon pokemon) {
		return "Name: " + pokemon.getName() + ", Type: " + pokemon.getType() + ", Health: " + pokemon.getHealth();
	}
}

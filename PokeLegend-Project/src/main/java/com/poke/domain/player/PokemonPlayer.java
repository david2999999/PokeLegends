package com.poke.domain.player;

import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.poke.domain.Pokemon;
import com.poke.domain.PokemonBag;
import com.poke.domain.bag.Bag;

import lombok.Data;

@Entity
@Data
public class PokemonPlayer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	@Enumerated(value = EnumType.STRING)
	private Gender gender;
	
	@OneToOne
	private PokemonBag pokemonBag;
	
	@OneToOne
	private Bag itemBag;
	
	private Integer pokeCoin;
	
	
	public boolean blackOut() {
		int pokemonFainted = 0;
		
		// checks how many pokemons fainted in the bag
		for(Pokemon pokemon : pokemonBag.getPokemons()) {
			if (Pokemon.fainted(pokemon)) {
				pokemonFainted++;
			}
		}
		// if the bag size equals the number of pokemon fainted
		// return true, else return false
		return pokemonFainted == pokemonBag.getPokemons().size() ? true : false;
	}
	
	public Pokemon getActivePokemon() {
		Pokemon activePokemon;
		Optional<Pokemon> firstPokemon = pokemonBag.getPokemons().stream().findFirst();
		
		if(firstPokemon.isPresent()) {
			activePokemon = firstPokemon.get();
			return activePokemon;
		}else {
			System.out.println("There is no active Pokemon in the Bag");
			return null;
		}
	}
	
//	public boolean switchPokemon(int decision) {
//		return getPokemonBag().switchPokemon(decision);
//	}
}












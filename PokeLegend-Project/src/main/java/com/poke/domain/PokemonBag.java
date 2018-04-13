package com.poke.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class PokemonBag {
	
	@OneToMany(mappedBy="pokemonBag", cascade=CascadeType.PERSIST)
	private Set<Pokemon> pokemons;
	
	// retrieve a pokemon from the bag by its name
	// search through the list of pokemons 
	// if the names match, return the pokemon
	public Pokemon getPokemonByName(Pokemon searchPokemon) {
		
		if(inTheBag(searchPokemon)) {
			for(Pokemon pokemon : pokemons) {
				if (pokemon.getName() == searchPokemon.getName()) {
					return pokemon;
				}
			}
		}
		
		System.out.println(searchPokemon.getName() + " is not in the bag");
		return null;
	}
	
	// checks if the bag is too full before adding the pokemon
	// into the bag
	public boolean addPokemonToBag(Pokemon pokemon) {
		if (getNumberOfPokemonInBag() < 6) {
			pokemons.add(pokemon);
			return true;
		}else {
			System.out.println("Your Bag is Full!");
			return false;
		}
	}
	
	// return the number of pokemons inside the pokemon bag
	public int getNumberOfPokemonInBag() {
		return pokemons.size();
	}
	
	// checks if the pokemon is inside the bag
	public boolean inTheBag(Pokemon searchPokemon) {
		return pokemons.contains(searchPokemon);
	}
	
}

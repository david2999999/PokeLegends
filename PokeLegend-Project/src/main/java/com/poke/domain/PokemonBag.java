package com.poke.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import lombok.Data;

@Entity
@Data
public class PokemonBag {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@OneToMany(mappedBy="pokemonBag", cascade=CascadeType.PERSIST)
	private List<Pokemon> pokemons;
	
	public PokemonBag() {
		this.pokemons = new ArrayList<>();
	}
	
	// retrieve a pokemon from the bag by its name
	// search through the list of pokemons 
	// if the names match, return the pokemon
	public Pokemon getPokemonByName(String searchPokemon) {

		for (Pokemon pokemon : pokemons) {
			if (pokemon.getPokemonName().getName().equals(searchPokemon)) {
				return pokemon;
			}
		}

		System.out.println(searchPokemon + " is not in the bag");
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
	
	public boolean switchPokemon(int decision) {
		
		if(decision < 0 || decision > 5) {
			System.out.println("There are only 6 pokemons. options (1 - 5)");
			return false;
			
		}else if(decision == 0) {
			Pokemon pokemonPicked = getPokemons().get(decision);
			
			if (pokemonPicked.getCurrentStats().getHp() == 0) {
				System.out.println(pokemonPicked.getPokemonName() + " is unable to battle.");
				return false;
			}else {
				System.out.println(pokemonPicked.getPokemonName() + " is already in battle");
				return false;
			}
		}else {
			Pokemon pokemonPicked = getPokemons().get(decision);
			
			if (pokemonPicked.getCurrentStats().getHp() == 0) {
				System.out.println(pokemonPicked.getPokemonName() + " is unable to battle.");
				return false;
			}else {
				Collections.swap(getPokemons(), 0, decision);
				return true;
			}
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
	
	// checks if the bag is full
	public boolean bagFull() {
		return pokemons.size() == 6;
	}


	
}

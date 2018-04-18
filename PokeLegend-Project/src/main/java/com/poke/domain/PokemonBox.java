package com.poke.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(exclude = {"pokemonPC"})
public class PokemonBox {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	private PokemonPc pokemonPC;
	
	@OneToMany(mappedBy="pokemonBox", cascade=CascadeType.ALL)
	private Set<Pokemon> pokemons = new HashSet<>();
	
	public void addPokemon(Pokemon pokemon) {
		pokemons.add(pokemon);
		pokemon.setPokemonBox(this);
	}
	
	
	// checks if the box is full
	// maximum number of pokemon in the box will be 30
	public boolean isFull() {
		return pokemons.size() == 30;
	}
	
	public boolean isInTheBox(Pokemon pokemon) {
		return pokemons.contains(pokemon);
	}
	
	// checks if the pokemon is inside the box
	public boolean isInTheBox(String pokemonName) {
		for(Pokemon pokemon: pokemons) {
			if (pokemon.getPokemonName().getName().equals(pokemonName)) {
				return true;
			}
		}
		
		return false;
	}
	
	// retrieve the pokemon from the box by its name
	public Pokemon getPokemon(String pokemonName) {
		for(Pokemon pokemon: pokemons) {
			if (pokemon.getPokemonName().getName().equals(pokemonName)) {
				return pokemon;
			}
		}
		
		return null;
	}
	
	// return the number of pokemons inside this box
	public int numberOfPokemonInTheBox() {
		return pokemons.size();
	}
	
	// release or remove the pokemon from the box
//	public boolean releasePokemon(String pokemonName) {
//		for(Pokemon pokemon: pokemons) {
//			if (pokemon.getPokemonName().getName().equals(pokemonName)) {
//				pokemons.remove(pokemons.indexOf(pokemon));
//				return true;
//			}
//		}
//		
//		return false;
//	}

}






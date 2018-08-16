package com.poke.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(exclude = {"pokemonBoxes"})
public class PokemonPc {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@OneToMany(mappedBy = "pokemonPC", cascade = CascadeType.ALL)
	private Set<PokemonBox> pokemonBoxes = new HashSet<>();
	
	public void addBox(PokemonBox pokemonBox) {
		pokemonBoxes.add(pokemonBox);
		pokemonBox.setPokemonPC(this);
	}
	// stores the pokemon into the specific boxNumber
	// if the box is full, do not store the pokemon
	// else store the pokemon
//	public boolean storePokemon(Pokemon pokemon, int boxNum) {
//		if (pokemonBoxes.get(boxNum).isFull()) {
//			System.out.println("Box " + boxNum + " is full!");
//			return false;
//		} else {
//			pokemonBoxes.get(boxNum).getPokemons().add(pokemon);
//			System.out.println(pokemon.getPokemonName().getName() + " has been sent to box " + boxNum);
//			return true;
//		}
//	}
	
	// retrieve the pokemon from the PC based on its name and box number
//	public Pokemon retrievePokemon(String pokemonName, int boxNum) {
//		if(pokemonBoxes.get(boxNum).isInTheBox(pokemonName)) {
//			return pokemonBoxes.get(boxNum).getPokemon(pokemonName);
//		}else {
//			System.out.println(pokemonName + " is not inside box " + boxNum);
//			return null;
//		}
//	}
	
	// release the pokemon from the PC
//	public boolean releasePokemon(String pokemonName, int boxNum) {
//		if(pokemonBoxes.get(boxNum).isInTheBox(pokemonName)) {
//			pokemonBoxes.get(boxNum).releasePokemon(pokemonName);
//			return true;
//		}else {
//			System.out.println(pokemonName + " is not inside " + boxNum);
//			return false;
//		}
//	}

	
}





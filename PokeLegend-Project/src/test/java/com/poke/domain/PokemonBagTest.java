package com.poke.domain;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.poke.domain.pokedetail.PokemonName;

public class PokemonBagTest {

	@Mock
	Pokemon pokemon;
	
	PokemonBag pokemonBag;
	
	@Before
	public void setUp() throws Exception {
		// this will initialize all of the @Mock fields
		MockitoAnnotations.initMocks(this);
		
		pokemonBag = new PokemonBag();
	}

	@Test
	public void getPokemonByNameTest() {
		String name = "Pikachu";
		Set<Pokemon> pokemons = new HashSet<>();
		
		Pokemon pokemon = new Pokemon();
		PokemonName pokemonName = new PokemonName(name);

		
		pokemon.setId(1L);
		pokemon.setPokemonName(pokemonName);
		
		pokemons.add(pokemon);
		
		pokemonBag.setPokemons(pokemons);
		
		assertEquals(pokemon, pokemonBag.getPokemonByName(name));
		assertNull(pokemonBag.getPokemonByName("Herro"));
		
	}
	
	@Test
	public void addPokemonToBagTest() throws Exception{
		String name = "Pikachu";
		PokemonName pokemonName = new PokemonName(name);
		
		Pokemon pokemon = new Pokemon();
		pokemon.setId(1L);
		pokemon.setPokemonName(pokemonName);
		
		assertEquals(true, pokemonBag.addPokemonToBag(pokemon));
		
		
		String name2 = "Charmander";
		PokemonName pokemonName2 = new PokemonName(name2);
		
		Pokemon pokemon2 = new Pokemon();
		pokemon.setId(1L);
		pokemon.setPokemonName(pokemonName2);
		//In the case of HashSet, the item isn't inserted.
		assertEquals(true, pokemonBag.addPokemonToBag(pokemon2));

		
		assertEquals(2, pokemonBag.getPokemons().size());
	}

}

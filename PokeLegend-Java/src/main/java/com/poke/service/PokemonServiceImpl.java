package com.poke.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poke.domain.Pokemon;
import com.poke.exceptions.NotFoundException;
import com.poke.repository.PokemonRepository;


@Service
public class PokemonServiceImpl implements PokemonService{

	// repositories for CRUD functions
	private final PokemonRepository pokemonRepository;
	
	@Autowired
	public PokemonServiceImpl(PokemonRepository pokemonRepository) {
		this.pokemonRepository = pokemonRepository;
	}

	@Override
	public List<Pokemon> getPokemons() {
		List<Pokemon> pokemons = new ArrayList<>();
		
		// retrieve all of the pokemon from the repository and add them to the list
		pokemonRepository.findAll().iterator().forEachRemaining(pokemons::add);
		
		return pokemons;
	}

	@Override
	@Transactional
	public Pokemon findById(long id) {
		Optional<Pokemon> pokemonOptional = pokemonRepository.findById(id);
		
		if (!pokemonOptional.isPresent()) {
			throw new NotFoundException("This pokemon is not found: Id = " + id);
		}
		
		return pokemonOptional.get();
	}

	@Override
	public void deleteById(long id) {
		pokemonRepository.deleteById(id);
	}

	@Override
	@Transactional
	public Pokemon save(Pokemon pokemonToBeSaved) {
		
		pokemonRepository.save(pokemonToBeSaved);
		
		return pokemonToBeSaved;
	}

	
}

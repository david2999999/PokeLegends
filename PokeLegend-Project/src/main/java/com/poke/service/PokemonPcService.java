package com.poke.service;

import com.poke.domain.PokemonPc;

public interface PokemonPcService {
	
	PokemonPc findById(long id);
	
	PokemonPc savebyId(PokemonPc pokemonPc);
	
	void deleteById(long id);
	
}

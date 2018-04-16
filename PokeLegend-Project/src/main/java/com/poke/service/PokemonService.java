package com.poke.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.poke.domain.Pokemon;

@Service
public interface PokemonService{
	
	List<Pokemon> getPokemons();
	
}

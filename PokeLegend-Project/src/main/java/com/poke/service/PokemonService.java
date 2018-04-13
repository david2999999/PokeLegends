package com.poke.service;

import java.util.Set;
import org.springframework.stereotype.Service;

import com.poke.domain.Pokemon;

@Service
public interface PokemonService{
	
	Set<Pokemon> getPokemons();
	
}

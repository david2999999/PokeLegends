package com.poke.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.poke.domain.player.PokemonPlayer;

@Service
public interface PokemonPlayerService {
	
	List<PokemonPlayer> getPokemonPlayers();
	
	PokemonPlayer findById(long id);
	
	PokemonPlayer save(PokemonPlayer pokemonPlayer);
	
	void deleteById(long id);
	
}

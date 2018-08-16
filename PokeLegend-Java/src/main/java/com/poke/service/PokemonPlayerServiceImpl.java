package com.poke.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poke.domain.player.PokemonPlayer;
import com.poke.exceptions.NotFoundException;
import com.poke.repository.PokemonPlayerRepository;

@Service
public class PokemonPlayerServiceImpl implements PokemonPlayerService{

	private final PokemonPlayerRepository pokemonPlayerRepository;
	
	@Autowired
	public PokemonPlayerServiceImpl(PokemonPlayerRepository pokemonPlayerRepository) {
		this.pokemonPlayerRepository = pokemonPlayerRepository;
	}

	@Override
	public List<PokemonPlayer> getPokemonPlayers() {
		List<PokemonPlayer> pokemonPlayers = new ArrayList<>();
		
		pokemonPlayerRepository.findAll().iterator().forEachRemaining(pokemonPlayers::add);
		
		return pokemonPlayers;
	}

	@Override
	public PokemonPlayer findById(long id) {
		Optional<PokemonPlayer> pokemonPlayerOptional = pokemonPlayerRepository.findById(id);
		
		if (!pokemonPlayerOptional.isPresent()) {
			throw new NotFoundException("Player not found: Id = " + id);
		}
		return pokemonPlayerOptional.get();
	}

	@Override
	@Transactional
	public PokemonPlayer save(PokemonPlayer pokemonPlayer) {
		pokemonPlayerRepository.save(pokemonPlayer);
		
		return pokemonPlayer;
	}

	@Override
	public void deleteById(long id) {
		pokemonPlayerRepository.deleteById(id);
	}

}

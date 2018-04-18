package com.poke.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.poke.domain.PokemonPc;
import com.poke.exceptions.NotFoundException;
import com.poke.repository.PokemonPcRepository;

@Service
public class PokemonPcServiceImpl implements PokemonPcService{

	private final PokemonPcRepository pokemonPcRepository;

	public PokemonPcServiceImpl(PokemonPcRepository pokemonPcRepository) {
		this.pokemonPcRepository = pokemonPcRepository;
	}
	
	@Override
	public PokemonPc findById(long id) {
		Optional<PokemonPc> pokemonPcOptional = pokemonPcRepository.findById(id);
		
		if (!pokemonPcOptional.isPresent()){
			throw new NotFoundException("Pokemon Pc Not Found: Id " + id);
		}
		
		return pokemonPcOptional.get();
	}

	@Transactional
	@Override
	public PokemonPc savebyId(PokemonPc pokemonPc) {
		pokemonPcRepository.save(pokemonPc);
		
		return pokemonPc;
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		
	}

}

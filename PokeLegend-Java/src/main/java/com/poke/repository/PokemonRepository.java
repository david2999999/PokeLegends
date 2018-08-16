package com.poke.repository;

import org.springframework.data.repository.CrudRepository;

import com.poke.domain.Pokemon;

public interface PokemonRepository extends CrudRepository<Pokemon, Long>{

}

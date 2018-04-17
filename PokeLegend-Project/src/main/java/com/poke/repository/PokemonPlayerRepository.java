package com.poke.repository;

import org.springframework.data.repository.CrudRepository;

import com.poke.domain.player.PokemonPlayer;

public interface PokemonPlayerRepository extends CrudRepository<PokemonPlayer, Long> {

}

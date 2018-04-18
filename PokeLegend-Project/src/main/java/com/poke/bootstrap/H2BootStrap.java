package com.poke.bootstrap;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.poke.domain.Pokemon;
import com.poke.domain.PokemonBag;
import com.poke.domain.PokemonBox;
import com.poke.domain.PokemonPc;
import com.poke.domain.pokedetail.Exp;
import com.poke.domain.pokedetail.Gender;
import com.poke.domain.pokedetail.Multiplier;
import com.poke.domain.pokedetail.Nature;
import com.poke.domain.pokedetail.PokemonName;
import com.poke.domain.pokedetail.Stat;
import com.poke.domain.pokedetail.Type;
import com.poke.repository.PokemonPcRepository;
import com.poke.repository.PokemonPlayerRepository;
import com.poke.repository.PokemonRepository;

@Component
public class H2BootStrap implements ApplicationListener<ContextRefreshedEvent>{

	private final PokemonRepository pokemonRepository;
	private final PokemonPlayerRepository pokemonPlayerRepository;
	private final PokemonPcRepository pokemonPcRepository;
	
	public H2BootStrap(PokemonRepository pokemonRepository, PokemonPlayerRepository pokemonPlayerRepository,
			PokemonPcRepository pokemonPcRepository) {
		this.pokemonRepository = pokemonRepository;
		this.pokemonPlayerRepository = pokemonPlayerRepository;
		this.pokemonPcRepository = pokemonPcRepository;
	}

	@Transactional
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		pokemonRepository.saveAll(getPokemons());
	}
	
	public List<Pokemon> getPokemons(){
		List<Pokemon> pokemons = new ArrayList<>(1);
		
		Pokemon pokemon = new Pokemon();
		
		PokemonName pokemonName = new PokemonName();
		pokemonName.setName("Lugia");
		pokemon.setPokemonName(pokemonName);
		
		pokemon.setNickName("Susy");
		pokemon.setGender(Gender.Male);
		pokemon.setNature(Nature.Sassy);
		
		Exp exp = new Exp();
		exp.setCurrentExp(123);
		pokemon.setExp(exp);
		
		pokemon.setLevel(99);
		
		pokemon.setType(Type.Psychic);
		pokemon.setType2(Type.Flying);
		
		Stat stat = new Stat();
		stat.setHp(322);
		stat.setAtk(166);
		stat.setDefense(238);
		stat.setSpAtk(238);
		stat.setSpDefense(281);
		stat.setSpeed(202);
		pokemon.setCurrentStats(stat);
		pokemon.setMaxStats(stat);
		
		Stat stat2 = new Stat();
		stat2.setHp(106);
		stat2.setAtk(90);
		stat2.setDefense(130);
		stat2.setSpAtk(90);
		stat2.setSpDefense(154);
		stat2.setSpeed(110);
		pokemon.setBaseStats(stat2);

		Multiplier multiplier = new Multiplier();
		multiplier.resetMultipliers();
		pokemon.setMultiplier(multiplier);
		
		PokemonBag pokemonBag = new PokemonBag();
		pokemonBag.addPokemonToBag(pokemon);
		
		PokemonPc pokemonPc = new PokemonPc();
		PokemonBox pokemonBox = new PokemonBox();
		pokemonBox.addPokemon(pokemon);
		pokemonPc.addBox(pokemonBox);;
				
		pokemonPcRepository.save(pokemonPc);
		
		pokemons.add(pokemon);
		
		return pokemons;
	}

	
	
	
}











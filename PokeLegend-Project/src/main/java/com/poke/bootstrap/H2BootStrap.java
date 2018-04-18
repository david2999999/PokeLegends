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
		pokemonPc.addBox(pokemonBox);
				
		pokemonPcRepository.save(pokemonPc);
		
		// another pokemon
		Pokemon pokemon2 = new Pokemon();
		
		PokemonName pokemonName2 = new PokemonName();
		pokemonName2.setName("Entei");
		pokemon2.setPokemonName(pokemonName2);
		
		pokemon2.setNickName("Entei");
		pokemon2.setGender(Gender.Genderless);
		pokemon2.setNature(Nature.Brave);
		
		Exp exp2 = new Exp();
		exp2.setCurrentExp(81);
		pokemon2.setExp(exp2);
		
		pokemon2.setLevel(50);
		
		pokemon2.setType(Type.Fire);
		
		Stat stat3 = new Stat();
		stat3.setHp(340);
		stat3.setAtk(211);
		stat3.setDefense(157);
		stat3.setSpAtk(166);
		stat3.setSpDefense(139);
		stat3.setSpeed(184);
		pokemon2.setCurrentStats(stat3);
		pokemon2.setMaxStats(stat3);
		
		Stat stat4 = new Stat();
		stat4.setHp(115);
		stat4.setAtk(115);
		stat4.setDefense(85);
		stat4.setSpAtk(90);
		stat4.setSpDefense(75);
		stat4.setSpeed(100);
		pokemon2.setBaseStats(stat4);

		Multiplier multiplier2 = new Multiplier();
		multiplier2.resetMultipliers();
		pokemon2.setMultiplier(multiplier2);
		
		PokemonBag pokemonBag2 = new PokemonBag();
		pokemonBag2.addPokemonToBag(pokemon2);
		
		PokemonPc pokemonPc2 = new PokemonPc();
		PokemonBox pokemonBox2 = new PokemonBox();
		pokemonBox2.addPokemon(pokemon2);
		pokemonPc2.addBox(pokemonBox2);
				
		pokemonPcRepository.save(pokemonPc2);
		
		
		
		
		pokemons.add(pokemon);
		
		return pokemons;
	}

	
	
	
}











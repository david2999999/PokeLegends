package com.poke.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.poke.domain.pokedetail.Exp;
import com.poke.domain.pokedetail.Gender;
import com.poke.domain.pokedetail.Multiplier;
import com.poke.domain.pokedetail.Nature;
import com.poke.domain.pokedetail.PokemonName;
import com.poke.domain.pokedetail.Stat;
import com.poke.domain.pokedetail.Type;

import lombok.Data;

@Data
@Entity
public class Pokemon {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	private PokemonName name;
	
	private String nickName;
	
	@Enumerated(value = EnumType.STRING)
	private Gender gender;
	
	@Enumerated(value = EnumType.STRING)
	private Nature nature;
	
	@OneToOne
	private Exp exp;
	
	private int level;
	
	@Enumerated(value = EnumType.STRING)
	private Type type;
	
	@Enumerated(value = EnumType.STRING)
	private Type type2;
	
	@OneToOne
	private Stat currentStats;
	
	@OneToOne
	private final Stat baseStats;
	
	@OneToOne
	private final Stat maxStats;
	
	@OneToOne
	private Multiplier multiplier;
	
	@ManyToOne
	private PokemonBag pokemonBag;
}


















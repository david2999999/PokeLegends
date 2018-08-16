package com.poke.domain;

import javax.persistence.CascadeType;
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
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(exclude = {"pokemonBox", "pokemonBag"})
public class Pokemon {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(cascade=CascadeType.ALL)
	private PokemonName pokemonName;
	
	private String nickName;
	
	@Enumerated(value = EnumType.STRING)
	private Gender gender;
	
	@Enumerated(value = EnumType.STRING)
	private Nature nature;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Exp exp;
	
	private Integer level;
	
	@Enumerated(value = EnumType.STRING)
	private Type type;
	
	@Enumerated(value = EnumType.STRING)
	private Type type2;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Stat currentStats;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Stat baseStats;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Stat maxStats;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Multiplier multiplier;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private PokemonBag pokemonBag;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private PokemonBox pokemonBox;
	
	public static boolean fainted(Pokemon pokemon) {
		return pokemon.getCurrentStats().getHp() == 0 ? true : false;
	}
	
	
}


















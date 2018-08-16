package com.poke.domain.item;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.poke.domain.bag.PokeballBag;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(exclude = {"pokeballBag"})
public class PokeBall {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private String description;
	
	private Integer catchRate;
	
	private String location;
	
	private Integer price;
	
	private Integer sellPrice;
	
	private Integer amount;
	
	@ManyToOne
	private PokeballBag pokeballBag;
}










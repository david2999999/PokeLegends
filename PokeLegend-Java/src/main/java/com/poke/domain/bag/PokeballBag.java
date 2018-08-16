package com.poke.domain.bag;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.poke.domain.item.PokeBall;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(exclude = {"pokeBalls"})
public class PokeballBag {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@OneToMany(mappedBy="pokeballBag", cascade=CascadeType.ALL)
	private Set<PokeBall> pokeBalls = new HashSet<>();
}

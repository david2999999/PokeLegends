package com.poke.domain.item;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.poke.domain.bag.TmBag;
import com.poke.domain.pokedetail.Type;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(exclude = {"tmBag"})
public class TM {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	@Enumerated(value = EnumType.STRING)
	private Category category;
	
	@Enumerated(value = EnumType.STRING)
	private Type type;
	
	private String description;
	
	private Integer PP;
	
	private Integer power;
	
	private Integer accuracy;
	
	@ManyToOne
	private TmBag tmBag;
	
}












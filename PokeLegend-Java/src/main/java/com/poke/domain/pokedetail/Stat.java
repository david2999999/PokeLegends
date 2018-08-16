package com.poke.domain.pokedetail;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Stat {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Integer hp;
	
	private Integer atk;
	
	private Integer spAtk;
	
	private Integer defense;
	
	private Integer spDefense;
	
	private Integer speed;
}

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
	
	private int hp;
	
	private int atk;
	
	private int spAtk;
	
	private int defense;
	
	private int spDefense;
	
	private int speed;
}

package com.poke.domain.pokedetail;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Multiplier {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private int atkMultiplier;
	 
	private int spAtkMultiplier;
	 
	private int defenseMultiplier;
	 
	private int spDefenseMultiplier;
	 
	private int speedMultiplier;
	 	
	public void resetMultipliers() {
		setAtkMultiplier(1);
		setSpAtkMultiplier(1);
		setDefenseMultiplier(1);
		setSpDefenseMultiplier(1);
		setSpeedMultiplier(1);
	}
	    
}









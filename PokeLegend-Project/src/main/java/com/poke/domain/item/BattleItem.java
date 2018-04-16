package com.poke.domain.item;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class BattleItem {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private Integer price;
	
	private Integer sellPrice;
	
	private String location;
	
	private String description;
	
	private Integer amount;
	
	@Enumerated(value = EnumType.STRING)
	private Category category;
}















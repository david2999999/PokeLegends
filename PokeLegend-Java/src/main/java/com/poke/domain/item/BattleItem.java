package com.poke.domain.item;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.poke.domain.bag.BattleItemBag;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(exclude = {"battleItemBag"})
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
	
	@ManyToOne
	private BattleItemBag battleItemBag;
}















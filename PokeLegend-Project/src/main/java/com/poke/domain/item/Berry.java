package com.poke.domain.item;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.poke.domain.bag.BerryBag;

import lombok.Data;

@Entity
@Data
public class Berry {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private String description;
	
	private Integer growthTime;
	
	private Integer amount;
	
	private Double size;
	
	private String location;
	
	private String firmness;
	
	@Enumerated(value = EnumType.STRING)
	private Category category;
	
	@ManyToOne
	private BerryBag berryBag;
}













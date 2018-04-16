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
public class Item {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	@Enumerated(value = EnumType.STRING)
	private Category category;
	
	private String description;
	
	private Integer amount;
	
}

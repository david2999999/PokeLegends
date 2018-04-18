package com.poke.domain.item;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.poke.domain.bag.MedicineBag;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(exclude = {"medicineBag"})
public class Medicine {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private String description;
	
	private Integer price;
	
	private Integer sellPrice;
	
	private Integer amount;
	
	private String location;
	
	@ManyToOne
	private MedicineBag medicineBag;
}

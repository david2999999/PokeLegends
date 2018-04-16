package com.poke.domain.item;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.poke.domain.bag.MailBag;

import lombok.Data;

@Entity
@Data
public class Mail {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Enumerated(value = EnumType.STRING)
	private Category category;
	
	private String name;
	
	private String description;
	
	private Integer price;
	
	private Integer sellPrice;
	
	private Integer amount;
	
	@ManyToOne
	private MailBag mailBag;
}












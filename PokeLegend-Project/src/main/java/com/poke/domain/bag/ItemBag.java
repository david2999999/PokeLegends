package com.poke.domain.bag;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class ItemBag {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
}

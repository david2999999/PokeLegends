package com.poke.domain.bag;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class KeyItemBag {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
}

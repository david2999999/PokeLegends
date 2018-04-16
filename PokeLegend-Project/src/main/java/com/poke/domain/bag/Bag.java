package com.poke.domain.bag;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Bag {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@OneToOne
	private BattleItemBag battleItemBag;
	
	@OneToOne
	private BerryBag berryBag;
	
	@OneToOne
	private ItemBag itemBag;
	
	@OneToOne
	private KeyItemBag keyItemBag;
	
	@OneToOne
	private MailBag mailBag;
	
	@OneToOne
	private MedicineBag medicineBag;
	
	@OneToOne
	private PokeballBag pokeballBag;
	
	@OneToOne
	private TmBag tmBag;
}















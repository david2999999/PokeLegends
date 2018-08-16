package com.poke.domain.bag;

import javax.persistence.CascadeType;
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
	
	@OneToOne(cascade=CascadeType.ALL)
	private BattleItemBag battleItemBag;
	
	@OneToOne(cascade=CascadeType.ALL)
	private BerryBag berryBag;
	
	@OneToOne(cascade=CascadeType.ALL)
	private ItemBag itemBag;
	
	@OneToOne(cascade=CascadeType.ALL)
	private KeyItemBag keyItemBag;
	
	@OneToOne(cascade=CascadeType.ALL)
	private MailBag mailBag;
	
	@OneToOne(cascade=CascadeType.ALL)
	private MedicineBag medicineBag;
	
	@OneToOne(cascade=CascadeType.ALL)
	private PokeballBag pokeballBag;
	
	@OneToOne(cascade=CascadeType.ALL)
	private TmBag tmBag;
}















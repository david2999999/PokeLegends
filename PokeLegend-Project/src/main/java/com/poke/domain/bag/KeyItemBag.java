package com.poke.domain.bag;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.poke.domain.item.KeyItem;

import lombok.Data;

@Entity
@Data
public class KeyItemBag {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@OneToMany(mappedBy="keyItemBag", cascade=CascadeType.ALL)
	private List<KeyItem> keyItems;
}

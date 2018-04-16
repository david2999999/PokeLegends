package com.poke.domain.bag;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.poke.domain.item.Mail;

import lombok.Data;

@Entity
@Data
public class MailBag {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@OneToMany(mappedBy="mailBag", cascade=CascadeType.ALL)
	private List<Mail> mails;
}

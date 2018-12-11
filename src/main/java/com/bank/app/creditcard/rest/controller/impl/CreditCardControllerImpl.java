package com.bank.app.creditcard.rest.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.app.creditcard.model.CreditCard;
import com.bank.app.creditcard.persistence.repository.CreditCardRepository;
import com.bank.app.creditcard.rest.controller.inter.CreditCardController;
import com.bank.app.creditcard.services.CreditCadrServicies;

@RestController
@RequestMapping("/creditcard")
public class CreditCardControllerImpl  {
	
	@Autowired
	CreditCadrServicies creditCadrServicies;
	
	@RequestMapping("/hola")
	public  String hello() {
		return "Hello Fucking world";
	}

	@RequestMapping(value="/create", method = RequestMethod.POST)
	public void create(@RequestBody CreditCard card) {
		
		creditCadrServicies.create(card);
		 
		
	}

	@RequestMapping(value="/listcreditcard", method = RequestMethod.GET)
	public List<CreditCard> listcreditcard() {
		
		return creditCadrServicies.list();
		
		 
	}

	@RequestMapping(value="/getCard{id}", method = RequestMethod.GET) 
	public CreditCard getCard(long id) {
		CreditCard card = new CreditCard();
		
		card = creditCadrServicies.getCard(id);
		
		return card;
	} 
	
	@RequestMapping(value="/listcardbytype", method = RequestMethod.GET)
	public List<CreditCard> listCardByType(@RequestParam String type) {
		
		return creditCadrServicies.listbytype(type);
		
		 
	}
	
	

}

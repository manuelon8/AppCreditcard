package com.bank.app.creditcard.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.bank.app.creditcard.model.CreditCard;
import com.bank.app.creditcard.persistence.repository.CreditCardRepository;

public class CreditCardServicesDirect   {

	@Autowired
	CreditCardRepository creditCardRepository;
	
	public CreditCard getCard(long id) {
		CreditCard c = new CreditCard();
		try {
			
			c =	creditCardRepository.findById(id).orElse(null);	
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return c;
	}
	
}

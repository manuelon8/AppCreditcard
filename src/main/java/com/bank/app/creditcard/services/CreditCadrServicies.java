package com.bank.app.creditcard.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bank.app.creditcard.model.CreditCard;
import com.bank.app.creditcard.persistence.repository.CreditCardRepository;
import com.bank.app.creditcard.rest.controller.inter.CreditCardController;

import java.util.logging.Level;
import java.util.logging.Logger;



 


@Transactional
@Service
public class CreditCadrServicies implements CreditCardController{
	
	private final static Logger LOGGER = Logger.getLogger("CreditCadrServicies.class");
	
	@Autowired
	CreditCardRepository creditCardRepository;

	@Override
	public void create(CreditCard card) {
		try {
			creditCardRepository.save(card);
			
		} catch (Exception e) {
			 LOGGER.log(Level.INFO, "Proceso No exitoso", e);
		}
		
	}

	@Override
	public List<CreditCard> list() {
		List<CreditCard> listCards = new ArrayList<>();
		try {
			
			Collections.sort(listCards = creditCardRepository.findAll());
			
			
		} catch (Exception e) {
			 LOGGER.log(Level.INFO, "Proceso de Listado No exitoso", e);
		}
		return listCards;
	}

	@Override
	public CreditCard getCard(long id) {
		CreditCard card = new CreditCard();
		try {
			
			card = creditCardRepository.findById(id).orElse(null);
			
		} catch (Exception e) {
			 LOGGER.log(Level.INFO, "Proceso No exitoso", e);
		}
		return card;
	}

	@Override
	public void deleteCard(long id) {
	 
		try {
			
			creditCardRepository.deleteById(id);
			
		} catch (Exception e) {
			 LOGGER.log(Level.INFO, "Eliminacion No exitosa", e);
		}
		
	}

	@Override
	public List<CreditCard> listbytype(String type) {
		List<CreditCard> listCards = new ArrayList<>();
		List<CreditCard> listCardsReady = new ArrayList<>();
		try {
			char c = type.charAt(0);
			listCards = creditCardRepository.findAll();
			listCards.stream().
					 filter(t->t.getBrand().charAt(0)==c).forEach(t->listCardsReady.add(t));		
			
		} catch (Exception e) {
			 LOGGER.log(Level.INFO, "Proceso de Listado No exitoso", e);
		}
		return listCardsReady;
	}
	
	

}

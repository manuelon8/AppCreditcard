package com.bank.app.creditcard;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bank.app.creditcard.model.CreditCard;
import com.bank.app.creditcard.persistence.repository.CreditCardRepository;
import com.bank.app.creditcard.rest.controller.impl.CreditCardControllerImpl;
import com.bank.app.creditcard.services.CreditCadrServicies;
import com.bank.app.creditcard.services.CreditCardServicesDirect;

@SpringBootApplication
public class CreditcardApplication {
	
 
	
	public static void main(String[] args) {
		SpringApplication.run(CreditcardApplication.class, args);

		System.out.println("------------------------------");
		
		
		
		
		Logger LOGGER = Logger.getLogger("CreditcardApplication.class");
		LOGGER.log(Level.INFO, "----------INICIO DE SISTEMA");
		
		
		
		
		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		Date e = new Date("11/12/2019");
//		 c.setExpirationDate(e);
//		 System.out.println("---------------fecha " + c.getExpirationDate());
//		 System.out.println("---------------fecha VALIDADA  " + c.validateCard());
//			
		
	}
	
 
}

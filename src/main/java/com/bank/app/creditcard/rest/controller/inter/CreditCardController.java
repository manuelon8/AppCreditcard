package com.bank.app.creditcard.rest.controller.inter;

import java.util.List;

import com.bank.app.creditcard.model.CreditCard;



public interface CreditCardController {
	
    void create(CreditCard card);
    List<CreditCard> list();
    List<CreditCard> listbytype(String type);
    CreditCard getCard(long id);
    void deleteCard(long id);

}

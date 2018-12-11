package com.bank.app.creditcard.rest.controller.inter;

import java.util.List;

import com.bank.app.creditcard.model.CreditCard;
import com.bank.app.creditcard.model.Operation;
 

public interface OperationController {
	
    void create(Operation operation);
    List<Operation> list();
    Operation getOperation(long id);    
    double  calculateOperationRateFromCard(CreditCard creditcard);
     
}
